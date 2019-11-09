package org.minus.java_grammer_prac.basic.thread_prac;

import java.util.concurrent.Callable;

/**
 * Created by zhengsihan, on 2019-11-08
 */
public class MyCallable implements Callable {
    public static void main(String[] args) {

    }

    @Override
    public String call() throws Exception {
        return "from MyCallable";
    }

    public void  func1() {

    }
}
