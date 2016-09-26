package com.coder.guider.observer;

/**
 * Created by apple on 16/9/26.
 */
public class Client extends Ab implements Subject {


    @Override
    public void register(Observer subject) {
        list.add(subject);
    }

    @Override
    public void unregister(Observer subject) {
        list.remove(subject);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).update();
        }
    }
}
