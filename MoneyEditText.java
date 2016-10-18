package id.web.hangga.gemi.CustomView;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Created by hangga on 18/10/16.
 */

public class MoneyEditText extends EditText {

    private DecimalFormat ina = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    private DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    private MoneyEditText moneyEditText;

    private String simbol = "Rp";

    public Double getValue() {
        return value;
    }

    private Double value;

    public MoneyEditText(Context context) {
        super(context);
        init();
    }

    public MoneyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MoneyEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        formatRp.setCurrencySymbol(simbol);
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        ina.setDecimalFormatSymbols(formatRp);

        moneyEditText = this;
        if (!isInEditMode()){
            this.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (moneyEditText.getText().toString().trim().length() > 0) {
                        moneyEditText.removeTextChangedListener(this);
                        String sVal = moneyEditText.getText().toString().replace(".", "").replace(simbol,"").replace("R","").replace("p","");
                        if (sVal.length() > 0) {
                            value = Double.parseDouble(sVal);
                            moneyEditText.setText(ina.format(value).replace(",00", ""));
                            moneyEditText.setSelection(moneyEditText.getText().toString().length());
                        }
                        moneyEditText.addTextChangedListener(this);
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
        }
    }

}
