package basic;

public class MemberVairableExample {
    private String name; //멤버변수
    private int age;//멤버변수
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        MemberVairableExample person1 = new MemberVairableExample();
        person1.name = "혜선";
        person1.age = 27;
        person1.displayInfo();
    }

}
