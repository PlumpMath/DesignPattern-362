package com.coder.guider.template;

import com.sun.xml.internal.rngom.parse.host.Base;

/**
 * Created by apple on 16/9/19.
 */
public class UserTemplate2 extends BaseTemplate {
    @Override
    public void hook() {
        System.out.println("  User2   hook"  );

    }

    @Override
    public String initMethod() {
        return "User2 " + this.getClass().getName();
    }
}
