package com.coder.guider.builder;

/**
 * Created by apple on 15/8/14.
 */
public class Dog {

//    良好的封装性， 使用建造者模式可以使客户端不必知道产品内部组成的细节；
//    建造者独立，容易扩展；
//    在对象创建过程中会使用到系统中的一些其它对象，这些对象在产品对象的创建过程中不易得到。
    DogBuilder builder;

    public Dog(DogBuilder builder) {
        this.builder = builder;
    }




}
