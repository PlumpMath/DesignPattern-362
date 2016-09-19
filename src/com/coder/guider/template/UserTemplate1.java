package com.coder.guider.template;

/**
 * Created by apple on 16/9/19.
 */
public class UserTemplate1 extends BaseTemplate {

    @Override
    public String initMethod() {
        return "User1 " + this.getClass().getName();
    }
}
