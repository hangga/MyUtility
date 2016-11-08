package id.web.hangga.glow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by hangga on 08/11/16.
 */

public class LayoutGlow extends RelativeLayout {

    private int glowColor = Color.parseColor("#FF4081");
    private Bitmap bitmap = createBitmap(200,200, glowColor);

    public LayoutGlow(Context context) {
        super(context);
        goGlow(this);
    }

    public LayoutGlow(Context context, AttributeSet attrs) {
        super(context, attrs);
        goGlow(this);
    }

    public LayoutGlow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        goGlow(this);
    }

    private void goGlow(View view){
        int margin = 100;
        int halfMargin = margin / 2;

        // The glow radius
        int glowRadius = 50;

        Bitmap src = bitmap;
        // Extract the alpha from the source image
        Bitmap alpha = src.extractAlpha();

        // The output bitmap (with the icon + glow)
        Bitmap bmp = Bitmap.createBitmap(src.getWidth() + margin,
                src.getHeight() + margin, Bitmap.Config.ARGB_8888);

        // The canvas to paint on the image
        /* Canvas */
        Canvas canvas = new Canvas(bmp);

        Paint paint = new Paint();
        paint.setColor(glowColor);

        // Outer glow
        ColorFilter emphasize = new LightingColorFilter(glowColor, 1);
        paint.setColorFilter(emphasize);
        canvas.drawBitmap(src, halfMargin, halfMargin, paint);
        paint.setColorFilter(null);
        paint.setMaskFilter(new BlurMaskFilter(glowRadius, BlurMaskFilter.Blur.OUTER));
        canvas.drawBitmap(alpha, halfMargin, halfMargin, paint);
        BitmapDrawable background = new BitmapDrawable(bmp);
        view.setBackgroundDrawable(background);
    }

    private static Bitmap createBitmap(int width, int height, int color) {
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setColor(color);
        canvas.drawRect(0F, 0F, (float) width, (float) height, paint);
        return bitmap;
    }
}
