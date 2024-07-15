package thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyCallable callable = new MyCallable(100);
        MyCallable callable2 = new MyCallable(3000);


        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        FutureTask<Integer> futureTask2 = new FutureTask<>(callable2);

        Thread thread1 = new Thread(futureTask);
        Thread thread2 = new Thread(futureTask2);
        thread1.start();
        thread2.start();
    }

    }

