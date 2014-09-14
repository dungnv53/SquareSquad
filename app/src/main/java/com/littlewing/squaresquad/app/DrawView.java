package com.littlewing.squaresquad.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by nickfarrow on 9/15/14.
 */
public class DrawView  extends View {
    Paint paint = new Paint();

    // TODO install an array of squares or ArrayList ...
    // use loop to init 21 square more faster.

    // TODO getWidth to multipler
    int multipler = (int)((getWidth()-100) / 112);
    int multi = 5; // hard code 720px

    Square sq50 = new Square(50 *multi); // based on 720 width
    Square sq35 = new Square(35 *multi);
    Square sq27 = new Square(27 *multi);
    Square sq15 = new Square(15 *multi);
    Square sq17 = new Square(17 *multi);
    Square sq8  = new Square(8 *multi);
    Square sq11 = new Square(11 *multi);
    Square sq19 = new Square(19 *multi);

    Square sq29 = new Square(29 *multi);
    Square sq25 = new Square(25 *multi);
    Square sq9 = new Square(9 *multi);
    Square sq7 = new Square(7 *multi);
    Square sq2 = new Square(2 *multi);
    Square sq18 = new Square(18 *multi);
    Square sq16 = new Square(16 *multi);
    Square sq24 = new Square(24 *multi);

    Square sq4 = new Square(4 *multi);
    Square sq33 = new Square(33 *multi);
    Square sq37 = new Square(37 *multi);
    Square sq42 = new Square(42 *multi);

    public DrawView(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        drawSquare(30, 30, canvas, sq50);
        drawSquare(30+sq50.getWidth(), 30, canvas, sq35);
        drawSquare(30+sq50.getWidth()+sq35.getWidth(), 30, canvas, sq27);

        drawSquare(30+sq50.getWidth(), 30+sq35.getWidth(), canvas, sq15);
        drawSquare(30+sq50.getWidth()+sq15.getWidth(), 30+sq35.getWidth(), canvas, sq17);
        drawSquare(30+sq50.getWidth()+sq35.getWidth(), 30+sq27.getWidth(), canvas, sq8);
        drawSquare(30+112*multi-sq19.getWidth(), 30+sq27.getWidth(), canvas, sq19);

        drawSquare(30, 30+sq50.getWidth(), canvas, sq29);
        drawSquare(30+sq29.getWidth(), 30+sq50.getWidth(), canvas, sq25);
        drawSquare(30, 30+sq29.getWidth()+sq50.getWidth(), canvas, sq33);

        drawSquare(30+sq33.getWidth(), 30+112*multi - sq37.getWidth(), canvas, sq37);
        drawSquare(30+112*multi-sq42.getWidth(), 30+112*multi-sq42.getWidth(), canvas, sq42);

        drawSquare(30+112*multi-sq24.getWidth(), 30+sq27.getWidth()+sq19.getWidth(), canvas, sq24);
//        drawSquare(30+112*multi-sq19.getWidth(), 30+sq27.getWidth(), canvas, sq19);
//        drawSquare(30+112*multi-sq19.getWidth(), 30+sq27.getWidth(), canvas, sq19);

//        paint.setStrokeWidth(0);
//        paint.setColor(Color.CYAN);
//        canvas.drawRect(33, 60, 77, 77, paint );
//        paint.setColor(Color.YELLOW);
//        canvas.drawRect(33, 33, 77, 60, paint );

    }

    // TODO int clr (need fill rect by color ?)
    public void drawSquare(int startX, int startY, Canvas cv, Square sq) {
        paint.setColor(Color.GRAY);
        paint.setStrokeWidth(2);
        cv.drawRect(startX, startY, startX+sq.getWidth(), startY+sq.getWidth(), paint);
        paint.setStrokeWidth(0);
        paint.setColor(Color.WHITE);
        cv.drawRect(startX+2, startY+2, startX+sq.getWidth()-2, startY+sq.getWidth()-2, paint);
        paint.setColor(Color.RED);
        paint.setTextSize(40);
        // TODO caused by view position --> text shifted 2 right-upper
        cv.drawText(sq.getWidth()/multi+"", startX + sq.getWidth()/2 *7/10, startY + sq.getWidth()/2*5/4, paint);
    }
}
