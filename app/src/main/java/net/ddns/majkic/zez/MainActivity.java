package net.ddns.majkic.zez;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    DemoView demoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        demoView = new DemoView(this);
        setContentView(demoView);
    }

    private class DemoView extends View{

        public DemoView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Paint p = new Paint();
            p.setStyle(Paint.Style.STROKE);
            p.setColor(Color.WHITE);
            canvas.drawPaint(p);
            p.setAntiAlias(true);
            p.setColor(Color.BLACK);
            canvas.drawCircle(90, 70, 50, p);
        }
    }
}
