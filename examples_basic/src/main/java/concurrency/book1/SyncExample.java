package concurrency.book1;

import java.util.concurrent.*;

public class SyncExample {

    public static void doSomethingA() {
        try{
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("---doSomethingA---");
    }

    public static void doSomethingB() {
        try{
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("---doSomethingB---");
    }

    public static String doSomethingC() {
        try {
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("---doSomethingC---");
        return "Task C Done!";
    }

    /**
     * 同步 阻塞
     */
    public static void fun1 () {
        long start = System.currentTimeMillis();
        doSomethingA();
        doSomethingB();
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void func2 () {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(() -> {
            try{
                doSomethingA();
            }catch (Exception e){
                e.printStackTrace();
            }
        }, "threadA");
        thread.start();
        doSomethingB();
        try {
            thread.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void func3() {
        long start = System.currentTimeMillis();
        Thread thread = new Thread("threadA") {
            @Override
            public void run() {
                try{
                    doSomethingA();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
        doSomethingB();
        try {
            thread.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    final static int AVAILABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();
    final static ThreadPoolExecutor POOL_EXECUTOR = new ThreadPoolExecutor(
            AVAILABLE_PROCESSORS
            , AVAILABLE_PROCESSORS * 2
            , 1
            , TimeUnit.MINUTES
            , new LinkedBlockingQueue<>(5)
            , new ThreadPoolExecutor.CallerRunsPolicy());

    public static void func4() {
        long start = System.currentTimeMillis();
        POOL_EXECUTOR.execute(() -> {
            try{
                doSomethingA();
            }catch (Exception e){
                e.printStackTrace();
            }
        });
        doSomethingB();
        System.out.println(System.currentTimeMillis() - start);
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void func5() {
        long start = System.currentTimeMillis();
        POOL_EXECUTOR.execute(() -> {
            doSomethingA();
        });

        POOL_EXECUTOR.execute(() -> {
            doSomethingB();
        });

        System.out.println(System.currentTimeMillis() - start);
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void func6() {
        Future<?> result = POOL_EXECUTOR.submit(() -> doSomethingC());
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        func6();
    }
}
