package com.coder.guider.bridge;

/**
 * Created by apple on 16/9/7.
 */
public class Circle extends Shape {

    public Circle(Drawing drawing) {
        super(drawing);
    }

    @Override
    public void draw() {
        drawCircle();
    }
}
