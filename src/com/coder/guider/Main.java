package com.coder.guider;

import com.coder.guider.桥接_装饰者_策略_对比学习.bridge.Rantangle;
import com.coder.guider.桥接_装饰者_策略_对比学习.bridge.Shape;
import com.coder.guider.builder.Dog;
import com.coder.guider.builder.DogBuilder;
import com.coder.guider.factory.CarFactory;
import com.coder.guider.factory.protrol.Car;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here


        CarFactory factory = new CarFactory();

        for (int i = 0; i < 20; i++) {
            int type = new Random().nextInt(4);
            Car car = factory.getCar(type);
            System.out.println(type);
            car.run();
        }



        // 建造者模式的使用
        Dog dog = new DogBuilder().setName("jack").setWeight(20).create();
        System.out.println("  start  ");


        new Rantangle().test();
        System.out.println("  shape  ");


        new Shape().test();

        System.out.println("  22222  ");
        new Rantangle().test2();
    }
}
