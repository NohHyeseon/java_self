package thread;

public class BankAccount {
    int money = 100_000; //통장 금액 설정해주기

    public int getMoney() {
        return money; //현재 통장 잔고 return
    }

    public void setMoney(int money) {
        this.money = money; //통장 잔고 설정
    }

    //입금
    //synchonized 메소드 활용
    public synchronized void saveMoney(int money){ //synchronized를 활용하여 여러 스레드가 동시접근X
        int currentMoney = getMoney();

        try{
            Thread.sleep(3000); //3초간 sleep
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        setMoney(currentMoney+money);//
        System.out.println("입금 후 계좌 잔액 : "+ currentMoney);
    }

    public int withDraw(int money){
        int currentMoney = getMoney();
        try {
            Thread.sleep(500); // 0.5초간 sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (currentMoney >= money) {
            setMoney(currentMoney - money);
            System.out.println("출금 후 계좌 잔액 : " + this.money);
            return money;
        } else {
            System.out.println("잔액이 부족합니다.");
            return 0; // 출금 실패를 나타내는 값 반환
        }
    }
}
class Father extends Thread{
    BankAccount account;
    public Father(BankAccount account){
        this.account = account;
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            account.saveMoney(10_000);
        }try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Mother extends Thread{
    BankAccount account;
    public Mother(BankAccount account){
        this.account = account;
    }

    @Override
    public void run(){
        for(int i=0; i<5; i++){
            account.withDraw(4000);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }}