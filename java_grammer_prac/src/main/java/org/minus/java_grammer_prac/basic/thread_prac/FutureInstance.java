package org.minus.java_grammer_prac.basic.thread_prac;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by zhengsihan, on 2019-11-08
 */
public class FutureInstance {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();

        //调用Callable
        Future<String> future = es.submit(new MyCallable());
        System.out.println(future.get());

        //调用Runnable
        es.submit(new MyRunnable());
    }
}
