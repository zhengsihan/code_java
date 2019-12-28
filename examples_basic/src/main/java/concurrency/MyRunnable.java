package concurrency;

public class MyRunnable implements Runnable {

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        System.out.println("from MyRunnable");
    }

    /**
     * lambda表达式练手
     */
    public void func1() {
        new Thread(() -> System.out.println("1")).start();
    }
}
