package com.coder.guider.桥接_装饰者_策略_对比学习.bridge;

/**
 * Created by apple on 16/9/7.
 */
public class Shape {
    public Shape() {
    }

    protected Drawing drawing;

    public Shape(Drawing drawing) {
        this.drawing = drawing;
    }

    public void draw() {
    }

    ;

    public void drawRectangle() {
        drawing.drawRantanle();
    }

    public void drawCircle() {
        drawing.drawCircle();
    }

    public void test() {
        System.out.println(this.getClass().getName());
        System.out.println(super.getClass().getName());


        System.out.println(this.getClass() == super.getClass());

        System.out.println("   ---  ");
    }

}
