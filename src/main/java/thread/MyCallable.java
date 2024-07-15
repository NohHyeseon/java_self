package thread;

import java.util.concurrent.Callable;

class MyCallable implements Callable<Integer> {
    private int number;
    public MyCallable(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "시작");
        Thread.sleep(500);
        return number * number;
    }
}
