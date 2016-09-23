package com.coder.guider.桥接_装饰者_策略_对比学习.strategy;

/**
 * Created by apple on 16/9/23.
 */
public class Add implements Calculate {
    @Override
    public int calculate(int A, int B) {
        System.out.println(A + B);
        return  (A+B);
    }
}
