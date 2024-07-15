package thread;

import java.time.LocalTime;

public class RunnableExample {
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            String result = "Called at "+ LocalTime.now();
            System.out.println(result);
        }
    }


    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
