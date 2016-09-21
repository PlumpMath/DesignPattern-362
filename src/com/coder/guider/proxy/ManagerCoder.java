package com.coder.guider.proxy;

import com.sun.tools.javac.jvm.Code;

/**
 * Created by apple on 16/9/21.
 */
public class ManagerCoder extends Coder {
    Coder coder = new AndroidCode();

    @Override
    public void write() {
        System.out.print(" Manager  ");

        coder.write();

    }
}
