package concurrency.book1;

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

    public static void main(String[] args) {
        func3();
    }
}
