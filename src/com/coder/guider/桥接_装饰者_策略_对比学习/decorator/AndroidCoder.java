package com.coder.guider.桥接_装饰者_策略_对比学习.decorator;

/**
 * Created by apple on 16/9/20.
 */
public class AndroidCoder implements Coder{

    @Override
    public void write() {
        System.out.println(" write android");
    }
}
