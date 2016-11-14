package com.poniyem.kangsen.CustomView;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.poniyem.kangsen.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by hangga on 14/11/16.
 */

public class MonthSpinner extends Spinner {
    public MonthSpinner(Context context) {
        super(context);
        generateMonth(context);
    }

    public MonthSpinner(Context context, AttributeSet attrs) {
        super(context, attrs);
        generateMonth(context);
    }

    public MonthSpinner(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        generateMonth(context);
    }

    private void generateMonth(Context context){
        int[] months = {0,1,2,3,4,5,6,7,8,9,10,11};
        List<String> xVals = new ArrayList<String>();

        for (int i = 0; i < months.length; i++) {
            Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), new Locale("in"));
            cal.set(Calendar.MONTH, months[i]);
            String month_name = new SimpleDateFormat("MMMM").format(cal.getTime());
            xVals.add(month_name);
        }
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(context, R.layout.layout_spinner_month, xVals);
        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(R.layout.layout_spinner_month);

        // attaching data adapter to spinner
        this.setAdapter(dataAdapter);
    }
}
