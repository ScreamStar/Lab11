package com.example.thecasp1k.lab11;

import android.content.Context;
import android.graphics.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class MainActivity extends AppCompatActivity {

    Paint p;
    int mywidth=0, myheight=0;
    Bitmap oleg;
    int bmpx=0,bmpy=0;
    Rect R1,R2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mm=new misha(this);
        setContentView(mm);
        oleg = BitmapFactory.decodeResource(getResources(), R.drawable.ui);
        bmpx = oleg.getWidth();
        bmpy = oleg.getHeight();
    }

    class misha extends View {
        public misha(Context context) {
            super(context);
            p = new Paint();
        }

        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            mywidth = w;
            myheight = h;
            super.onSizeChanged(w, h, oldw, oldh);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            R1 = new Rect(410,0,817,607);
            R2 = new Rect(250,250,850,1200);
            canvas.drawBitmap(oleg,R1,R2,p);
            R1 = new Rect(0,780,270,1035);
            R2 = new Rect(90, 470,440,820);
            canvas.drawBitmap(oleg,R1,R2,p);
        }
    }
    misha mm;
}
