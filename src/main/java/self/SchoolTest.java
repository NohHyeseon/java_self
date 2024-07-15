package self;

public class SchoolTest {
    public static void main(String[] args) {
        School school = new School();
        school.addStudent(new Student("노헤헤",19,"123"));
        school.addStudent(new Student("노젤리",14,"345"));
        school.addStudent(new Student("노쿠쿠",10,"567"));

        System.out.println("all student !!");
        school.listStudents();

        Student student = school.FindStudent(2);
        if(student != null) {
            System.out.println("Found student: " + student);
        }else System.out.println("Student not found");

        school.listStudents();
        System.out.println("student list");


    }
}
