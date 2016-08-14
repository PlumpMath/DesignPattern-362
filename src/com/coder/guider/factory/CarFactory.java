package com.coder.guider.factory;

import com.coder.guider.factory.material.保时捷;
import com.coder.guider.factory.material.奔驰;
import com.coder.guider.factory.material.宝马;
import com.coder.guider.factory.protrol.Car;

/**
 * Created by apple on 16/8/12.
 */
public class CarFactory {


    // 工厂模式, 对象生成器, 用于生成大量不同的对象,

    public <T> T getCar(Class clz) {

        try {
            return (T) clz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


    public Car getCar(int type) {
        Car car;

        switch (type) {
            case 1:
                car = new 保时捷();
                break;
            case 2:
                car = new 宝马();
                break;
            default:
                car = new 奔驰();
        }
        return car;

    }


}
