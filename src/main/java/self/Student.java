package self;

public class Student {
    private String name;
    private int Age;
    private String schoolNb;

    public Student(String name, int age, String schoolNb){
        this.name = name;
        this.Age = age;
        this.schoolNb = schoolNb;

    }
    public String  getName(){
        return name;
    }
    private int getAge(){
        return Age;
    }
    private String getSchoolNb(){
        return schoolNb;
    }

    public String toString(){
        return name + " " + Age + " " + schoolNb + " " + getName();
    }
}
