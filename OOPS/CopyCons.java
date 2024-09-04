package OOPS;

public class CopyCons {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "vivek";
        s1.roll = 34;
        s1.password = "abcd";

        Student s2 = new Student(s1);
        s2.password = "cdf";
        System.out.println(s2.password);
    }
}

class Student {
    String name;
    int roll;
    String password;

    // Copy Constructor
    Student(Student s1) {
        this.roll = s1.roll;
        this.name = s1.name;
        this.password = s1.password;     //if we will not pass also the program will run
    }

    // Default Constructor
    Student() {
        System.out.println("Student is calling");
    }
}
