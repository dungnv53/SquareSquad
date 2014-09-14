package com.littlewing.squaresquad.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

/**
 * Created by nickfarrow on 9/15/14.
 */
public class StartDraw extends Activity {
    DrawView drawView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        drawView = new DrawView(this);
        drawView.setBackgroundColor(Color.WHITE);
        setContentView(drawView);

    }
}
