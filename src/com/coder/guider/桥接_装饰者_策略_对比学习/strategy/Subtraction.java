package com.coder.guider.桥接_装饰者_策略_对比学习.strategy;

/**
 * Created by apple on 16/9/23.
 */
public class Subtraction implements Calculate {

    @Override
    public int calculate(int A, int B) {
        return (A-B);
    }
}
