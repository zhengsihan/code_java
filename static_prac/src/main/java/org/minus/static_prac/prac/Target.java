package org.minus.static_prac.prac;

/**
 * Created by zhengsihan, on 2019-11-11
 */
public class Target {
    static {
        System.out.println("代码块");
        String a = "hello";
    }

    public static void main(String[] args) {

    }

    static {
        System.out.println("After");
    }
}
