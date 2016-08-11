package com.coder.guider.singleton;

public class HungerSingleton {

//	懒汉式单例 缺点是内存消耗严重 一定创建对象 却不一定被使用  并且不能传递参数  因此基本上不会被使用  

    private static HungerSingleton ins = new HungerSingleton();

    private HungerSingleton() {

    }

    public static HungerSingleton getInstance() {
        return ins;
    }

}
