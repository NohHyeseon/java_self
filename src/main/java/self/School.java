package self;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> students;

    public School(){
        students = new ArrayList<Student>();
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public Student FindStudent(int schoolAge) {
        for (Student student : students) {
            if (student.getName() !=null) {
                return student;
            }
        }
        return null;
    }

    public void listStudents(){
        for(Student student : students){
            System.out.println(student);
        }
    }


}
