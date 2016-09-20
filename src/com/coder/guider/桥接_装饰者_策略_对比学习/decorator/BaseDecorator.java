package com.coder.guider.桥接_装饰者_策略_对比学习.decorator;

/**
 * Created by apple on 16/9/20.
 */
public class BaseDecorator implements Coder{

    private Coder coder;

    public BaseDecorator(Coder coder) {
        this.coder = coder;
    }

    @Override
    public void write() {
        coder.write();
    }
}
