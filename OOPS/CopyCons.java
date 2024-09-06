package OOPS;

public class CopyCons {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "vivek";
        s1.roll = 34;
        s1.password = "abcd";
        s1.marks[0]=1;
        s1.marks[1]=2;
        s1.marks[2]=3;
        

        Student s2 = new Student(s1);
        s2.password = "cdf";
        s1.marks[2]=5;                         //means it is call by reference ;
        System.out.println(s2.password);
        for (int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[]=new int[3];

    // Copy Constructor
    Student(Student s1) {
      //  marks= new int[3];
        this.roll = s1.roll;
        this.name = s1.name;
        this.password = s1.password;     //if we will not pass also the program will run
        this.marks=s1.marks;
         
    }

    // Default Constructor
    Student() {
        System.out.println("Student is calling");
    }
}
