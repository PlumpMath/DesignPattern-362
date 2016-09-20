package com.coder.guider.桥接_装饰者_策略_对比学习.decorator;

/**
 * Created by apple on 16/9/20.
 */
public class ADecorator extends BaseDecorator {
    public ADecorator(Coder coder) {
        super(coder);
    }

    @Override
    public void write() {
        super.write();
        System.out.println(" Decoratro  A ");

    }
}
