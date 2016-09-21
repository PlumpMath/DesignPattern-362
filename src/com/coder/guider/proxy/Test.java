package com.coder.guider.proxy;

/**
 * Created by apple on 16/9/21.
 */
public class Test {

    public static void main(String []args){
        Coder coder = new AndroidCode();
        coder.write();
        new ManagerCoder().write();

    }
}
