package thread;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Father father = new Father(bankAccount);
        Mother mother = new Mother(bankAccount);
        father.start();
        mother.start();

    }
}
