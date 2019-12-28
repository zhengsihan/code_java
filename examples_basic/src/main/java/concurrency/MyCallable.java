package concurrency;

import java.util.concurrent.Callable;

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
