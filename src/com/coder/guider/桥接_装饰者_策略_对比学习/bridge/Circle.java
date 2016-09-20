package com.coder.guider.桥接_装饰者_策略_对比学习.bridge;

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
