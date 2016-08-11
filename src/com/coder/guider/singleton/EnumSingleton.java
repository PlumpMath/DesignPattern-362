package com.coder.guider.singleton;

/**
 * Created by apple on 15/8/12.
 */
public enum EnumSingleton {
    ENUM_SINGLETON;
//    这种方式是Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
//    通过这种方式，不能通过反射和序列化来获取一个实例，因为所有的枚举类都继承自java.lang.Enum类, 而不是Object类：


    public void 干坏事(){

    }



}
