package com.coder.guider.template;

/**
 * Created by apple on 16/9/19.
 */
public abstract class BaseTemplate {

    public void templetaMethod() {

        initMethod();
        hook();
        doDefault();

    }

    public abstract void initMethod();

    public final void doDefault() {

    }


    public  void hook() {

    }


}
