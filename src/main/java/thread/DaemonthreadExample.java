package thread;

public class DaemonthreadExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                try{
                    System.out.println("daemonthread실행");
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        daemonThread.setDaemon(true);// 이 스레드를 데몬스데르로 설정
        daemonThread.start();

        try{
            System.out.println("주 쓰레드가 5초 동안 실행됩니다");
            Thread.sleep(5000);
            System.out.println("주 쓰레드 종료");
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}

