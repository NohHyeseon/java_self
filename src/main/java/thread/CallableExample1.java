package thread;

import java.time.LocalTime;
import java.util.concurrent.*;

public class CallableExample1 {
    static class MyCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            //스레드가 실행할 작업 구현
            String result = "Called at " + LocalTime.now();
            return result;
        }
    }

    public static void main(String[] args) throws ExecutionException,InterruptedException {
        MyCallable callable = new MyCallable();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<String> future = executor.submit(callable);

        String result = future.get();

        System.out.println("result: " + result);
    }
}
