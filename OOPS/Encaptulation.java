package OOPS;

public class Encaptulation {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("green");
        //System.out.println(p1.color);
        // p1.color="blue";
        // p1.setColor("blue");
        //System.out.println(p1.color);


        // By geters and seters
        p1.setColor("blue");
        System.out.println(p1.getColor());



    }

}

class Pen {
    String color;
    String tip;

    String getColor(){
        return this.color;
    }

    String getTip(){
        return this.tip;
    }

    void setColor(String color) {
        this.color = color;

    }

    void setTip(String tip) {

        this.tip = tip;
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
