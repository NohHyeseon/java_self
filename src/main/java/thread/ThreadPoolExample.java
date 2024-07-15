package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        //thread pool생성 3개의 스레드를 가진 스레드 풀

        for (int i = 0; i < 5; i++) {
            Runnable workder = new WorkerThread("Task " + i);
            executor.execute(workder);//작업 완료 후 스레드풀 종료
        }
        executor.shutdown();//모든 작업이 완료될때까지 대기
        while (!executor.isTerminated()) { //아무작업도 하지않는다

        }
        System.out.println("모든 작업 완료");
    }


}

class WorkerThread implements Runnable {
    private String taskName;

    public WorkerThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 시작: " + taskName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " 종료: " + taskName);
    }
}