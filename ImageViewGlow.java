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
import android.widget.ImageView;

/**
 * Created by hangga on 08/11/16.
 */

public class ImageViewGlow extends ImageView {

    private ImageViewGlow imageViewGlow;
    private Bitmap bitmap;
    private int glowColor = Color.YELLOW;

    public ImageViewGlow(Context context) {
        super(context);
        imageViewGlow = this;
        bitmap = ((BitmapDrawable)imageViewGlow.getDrawable()).getBitmap();
    }

    public ImageViewGlow(Context context, AttributeSet attrs) {
        super(context, attrs);
        imageViewGlow = this;
        bitmap = ((BitmapDrawable)imageViewGlow.getDrawable()).getBitmap();
    }

    public ImageViewGlow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        imageViewGlow = this;
        bitmap = ((BitmapDrawable)imageViewGlow.getDrawable()).getBitmap();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int margin = 20;
        int halfMargin = margin / 2;

        // The glow radius
        int glowRadius = 15;

        Bitmap src = bitmap;
        // Extract the alpha from the source image
        Bitmap alpha = src.extractAlpha();

        // The output bitmap (with the icon + glow)
        Bitmap bmp = Bitmap.createBitmap(src.getWidth() + margin,
                src.getHeight() + margin, Bitmap.Config.ARGB_8888);

        // The canvas to paint on the image
        /*Canvas */
        canvas = new Canvas(bmp);

        Paint paint = new Paint();
        paint.setColor(glowColor);

        // Outer glow
        ColorFilter emphasize = new LightingColorFilter(glowColor, 1);
        paint.setColorFilter(emphasize);
        canvas.drawBitmap(src, halfMargin, halfMargin, paint);
        paint.setColorFilter(null);
        paint.setMaskFilter(new BlurMaskFilter(glowRadius, BlurMaskFilter.Blur.OUTER));
        canvas.drawBitmap(alpha, halfMargin, halfMargin, paint);
        this.setImageBitmap(bmp);
    }
}
