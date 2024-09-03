package OOPS;

public class Encaptulation {
    public static void main(String args[]) {
        Pen p1= new Pen();
        p1.setColor("green");
        System.out.println(p1.color);
        // p1.color="blue";
        p1.setColor("blue");
        System.out.println(p1.color);

    }

}

class Pen {
    String color;
    String tip;

    void setColor(String newColor) {
        color = newColor;

    }

    void setTip(String newTip) {

        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calCgpa(int phy, int chem, int math) {

        percentage = (phy + chem + math) / 3;
    }

}
