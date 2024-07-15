package basic;

public class LocalVariableExample {
    public void calculateSum(){
        int num1 = 10; //지역변수
        int num2 = 20; //지역변수
        int sum = num1 + num2;//지역변수
        System.out.println("sum = " + sum);
    }


    public static void main(String[] args) {
        LocalVariableExample example = new LocalVariableExample();
        example.calculateSum();//calculateSum 메서드 호출
    }
}
