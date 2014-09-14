package com.littlewing.squaresquad.app;

/**
 * Created by nickfarrow on 9/15/14.
 */
public class Square {
    private int width;

    public Square() {
        this.width = 0;
    }

    public Square(int d) {
        this.width = d;
    }

    public int getWidth() {
        return this.width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
}
