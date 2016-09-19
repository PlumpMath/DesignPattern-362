package com.coder.guider.template;

/**
 * Created by apple on 16/9/19.
 */
public abstract class BaseTemplate {

    public final void templetaMethod() {
        initMethod();
        hook();
        doDefault();

    }


    public  void doDefault() {
        System.out.println(initMethod());

    }

    public  void hook() {

    }

    public abstract String initMethod();

}
