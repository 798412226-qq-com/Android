package com.example.demo02;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class  Rabbitview extends View {
    public float bitmapX;
    public float bitmapY;


    public Rabbitview(Context context) {
        super(context);
        bitmapX = 290;
        bitmapY = 130;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.mipmap.img03);
        //Canvas.drawBitmap(bitmap, bitmapX, bitmapY, paint);
        canvas.drawBitmap(bitmap, bitmapX, bitmapY, paint);
        if(bitmap.isRecycled())
        {
            bitmap.recycle();
        }

    }
}
