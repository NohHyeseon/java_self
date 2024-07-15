package thread;

class NumberPrinter implements Runnable{
    private String threadName;

    public NumberPrinter(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class test{
    public static void main(String[] args) throws InterruptedException {
        NumberPrinter printer = new NumberPrinter("Thread");
        NumberPrinter printer2 = new NumberPrinter("Thread2");

        Thread t1 = new Thread(printer);
        Thread t2 = new Thread(printer2);

        t1.start();
        t1.join();

        t2.start();
    }
}
