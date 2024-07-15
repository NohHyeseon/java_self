package basic;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("혜선",27);

        System.out.println("Name: "+person.getName());
        System.out.println("Age: "+person.getAge());


        person.setName("젤리");
        person.setAge(7);

        System.out.println("update Name: "+person.getName());
        System.out.println("update age: "+person.getAge());
    }
}
