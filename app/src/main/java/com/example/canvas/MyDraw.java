package com.example.canvas;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class MyDraw extends View {
    public MyDraw(Context context) {
        super(context);
    }

    @SuppressLint("Range")
    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.GREEN); // цвет маркера
        paint.setStyle(Paint.Style.FILL_AND_STROKE); // заливка
        paint.setAntiAlias(true); // сглаживание
        paint.setTextSize(100); // размер текста
        paint.setStrokeWidth(10); // толщина маркера
        int y = getHeight() / 2;
        int x = getWidth() / 2;
        canvas.drawColor(Color.rgb(0,0,2500)); // цвет фона

        RectF rectF = new RectF(700, 1400, 900, 800);
        canvas.drawOval(rectF, paint);
        paint.setColor(Color.WHITE);;
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);
        RectF rectF1 = new RectF(695, 1403, 905, 798);
        canvas.drawOval(rectF1, paint);
        //крыша
        float rotate_center_x = 299;
        float rotate_center_y = 830;
        float rotate_angle = 45;

        canvas.rotate(-rotate_angle, rotate_center_x, rotate_center_y);
        paint.setColor(Color.LTGRAY);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(300);
        canvas.drawLine(300, 900, 0, 900, paint);
        canvas.rotate(rotate_angle, rotate_center_x, rotate_center_y);


        paint.setColor(Color.rgb(0,2000,0));
        canvas.drawCircle(1005,1400,150,paint);
        paint.setColor(Color.rgb(0,1000,0));
        canvas.drawCircle(1005,1400,140,paint);


        paint.setColor(Color.YELLOW);
        paint.setColor(Color.parseColor("#ff5500"));
        paint.setStrokeWidth(30);
        canvas.drawLine(800, 1400, 800, 1500, paint);
        paint.setColor(Color.rgb(0,1500,0));
        paint.setStrokeWidth(500);
        canvas.drawLine(0, 1700, 2000, 1700, paint);
        paint.setColor(Color.GRAY);
        paint.setStrokeWidth(5);
        paint.setColor(Color.LTGRAY);
        paint.setStyle(Paint.Style.FILL); // заливка
        canvas.drawRect(30, 1475, 460, 975, paint);
        paint.setStyle(Paint.Style.STROKE); // заливка
        paint.setColor(Color.RED);
        canvas.drawRect(30, 1475, 460, 975, paint);

        paint.setColor(Color.rgb(2000,0,0));
        paint.setStrokeWidth(20);
        canvas.drawLine(270, 755, 20, 1000, paint);
        canvas.drawLine(240, 755, 475, 1000, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawCircle(50,50,85,paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(50,50,70,paint);

        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.YELLOW);
        Path path1 = new Path();
        path1.moveTo(0, 0);
        int y2 = 25;
        int x2 = 500;
        while (x2 != 0 && y2 != 505) {
            path1.lineTo(x2, y2);
            canvas.drawPath(path1, paint);
            path1.moveTo(0, 0);
            y2 += 25;
            x2 -= 25;
        }


//лавочка
        paint.setColor(Color.rgb(70,0,12));
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.FILL); // заливка
        canvas.drawRect(725, 1545, 775, 1455, paint);
        paint.setStyle(Paint.Style.STROKE); // заливка
        paint.setColor(Color.WHITE);
        canvas.drawRect(725, 1545, 775, 1455, paint);

        paint.setColor(Color.rgb(70,0,12));
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.FILL); // заливка
        canvas.drawRect(975, 1545, 925, 1455, paint);
        paint.setStyle(Paint.Style.STROKE); // заливка
        paint.setColor(Color.WHITE);
        canvas.drawRect(975, 1545, 925, 1455, paint);

        paint.setColor(Color.rgb(70,0,12));
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.FILL); // заливка
        canvas.drawRect(700, 1505, 1000, 1455, paint);
        paint.setStyle(Paint.Style.STROKE); // заливка
        paint.setColor(Color.WHITE);
        canvas.drawRect(700, 1505, 1000, 1455, paint);
        //типо яблоки
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.rgb(950,0,0));
        canvas.drawCircle(825,1325,15,paint);
        canvas.drawCircle(800,1300,15,paint);
        canvas.drawCircle(800,950,15,paint);
        canvas.drawCircle(875,1250,15,paint);
        canvas.drawCircle(860,1150,15,paint);
        canvas.drawCircle(780,1250,15,paint);
        canvas.drawCircle(775,1100,15,paint);
        canvas.drawCircle(775,1000,15,paint);
        canvas.drawCircle(770,1000,15,paint);
        canvas.drawCircle(760,1435,15,paint);
        canvas.drawCircle(995,1545,15,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.rgb(2000,0,0));
        paint.setStrokeWidth(7);
        Path path2 = new Path();
        int y11 = 1070;
        int x11 = 250;
        int y12 = 1200;
        int x12 = 350;
        path2.moveTo(x11,y11);
        while (x11 != 130 && y11 != 1470){
            path2.lineTo(x12, y12);
            canvas.drawPath(path2,paint);
            y11 += 10;
            x11 -= 10;
            y12 += 10;
            x12 -= 10;
            path2.moveTo(x11,y11);
        }

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.rgb(0,2000,0));
        canvas.drawCircle(25,1350,150,paint);
        paint.setColor(Color.rgb(0,1000,0));
        canvas.drawCircle(20,1350,140,paint);
        paint.setColor(Color.rgb(0,2000,0));
        canvas.drawCircle(80,1450,150,paint);
        paint.setColor(Color.rgb(0,1000,0));
        canvas.drawCircle(80,1450,140,paint);
    }
}








