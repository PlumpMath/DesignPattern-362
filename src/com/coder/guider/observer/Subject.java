package com.coder.guider.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 16/9/26.
 */
public interface Subject {
    List<Observer> list = new ArrayList<>();


    void register(Observer subject);

    void unregister(Observer subject);

    void notifyObserver();

}
