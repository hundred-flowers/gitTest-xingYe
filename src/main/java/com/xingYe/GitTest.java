package com.xingYe;

import java.util.Date;

/**
 * @Date: 2023/1/17 13:53
 * @Description:
 * @Version: 1.0
 */
public class GitTest {
    public static void main(String[] args) {
        System.out.println("Hello,Git");
        System.out.println("现在的时间是："+new Date());
        System.out.println(sum(7.2,3.4));
    }

    public static double sum(double a,double b){
        return a+b;
    }
}
