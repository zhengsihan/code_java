package zsh.dbc.practice.baseFunction;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhengsihan, on 2019-10-24
 */
public class ThreadPrac {
    public static void main(String[] args) {
//        ThreadPoolExecutor tpe = new ThreadPoolExecutor(4, 8, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        ExecutorService es = Executors.newFixedThreadPool(8);
        AtomicInteger ai = new AtomicInteger(1);
        Callable c1 = new Callable() {
            @Override
            public Object call() throws Exception {
                ai.addAndGet(1);
                return String.format("第%d次", ai.get());
            }
        };
        Future<Object> f = es.submit(c1);
        try {
            f.get();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void m1(){
        AtomicInteger ai = new AtomicInteger(1);
        for(int i = 0; i < 20; i++) {
            new ThreadPrac().p1(ai);
        }
        System.out.println(ai);
    }

    private void p1(AtomicInteger ai) {
        Thread t1 = new Thread(
                () -> {
                    System.out.println(String.format("%s - %d", "thread-0", ai.addAndGet(1)));
                }
        );

        Thread t2 = new Thread(
                () -> {
                    System.out.println(String.format("%s - %d", "thread-1", ai.addAndGet(1)));
                }
        );

        t1.start();
        t2.start();
    }


    private void p2(AtomicInteger ai) {
        Callable c1 = new Callable() {
            @Override
            public Object call() throws Exception {
                ai.addAndGet(1);
                return String.format("第%d次", ai.get());
            }
        };
    }
}
