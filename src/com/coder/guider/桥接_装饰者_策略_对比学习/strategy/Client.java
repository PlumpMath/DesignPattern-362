package com.coder.guider.桥接_装饰者_策略_对比学习.strategy;

/**
 * Created by apple on 16/9/23.
 */
public class Client implements Calculate {
    private  Calculate calculate;

    public Client(Calculate calculate) {
        this.calculate = calculate;
    }

    @Override
    public int calculate(int A, int B) {

        if (calculate==null){

            throw  new IllegalArgumentException("  策略 为空");
        }
        return calculate.calculate(A,B);
    }

    public static int calculate(Calculate calculate,int a,int b){

        return calculate.calculate(a,b);
    }
}
