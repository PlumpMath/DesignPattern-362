package com.coder.guider.singleton;

/**
 * Created by apple on 15/8/12.
 */
public class InClassSingleton {

    // 内部类实现单例   优点是 其他类在加载Singleton 只新建了一个引用并没有创建对象(既延后创建对象,并且是线程安全)
    // 只有调用getInstance()时内部类会被加载并且声称一个Singleton

    // 缺点是   需要一个存放内部类较大的内存

    public static class SingletonHolder {
        private static InClassSingleton ins = new InClassSingleton();
    }

    public static InClassSingleton getInstance() {
        return SingletonHolder.ins;
    }


}
