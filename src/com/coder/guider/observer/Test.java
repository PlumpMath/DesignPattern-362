package com.coder.guider.observer;

/**
 * Created by apple on 16/9/26.
 */
public class Test  {
    public static  void main(String arg[]){

        UserA userA = new UserA();
        Client client =new Client();
        client.register(userA);

        client.notifyObserver();
    }
}
