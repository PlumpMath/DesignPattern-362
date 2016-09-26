package com.coder.guider.observer;

/**
 * Created by apple on 16/9/26.
 */
public class UserA implements Observer {

    @Override
    public void update() {
        System.out.println("   update   ");
    }
}
