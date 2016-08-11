package com.coder.guider;

import com.coder.guider.singleton.EnumSingleton;

public class Main {

    public static void main(String[] args) {
        // write your code here

        EnumSingleton singleton = EnumSingleton.ENUM_SINGLETON;

        System.out.println( " singleton  =  "+singleton.getDeclaringClass()  );

    }
}
