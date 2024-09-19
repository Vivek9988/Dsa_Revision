package OOPS.inheritance;

public class First {
    public static void main(String args[]) {
        Fish f1 = new Fish();
        f1.eat();

    }

}

// base class or parent class
class Animal {
    String Color;

    void eat() {
        System.out.println("Eats");

    }

    void breadth() {
        System.out.println("breadth");

    }

}

// derived class or child class  ex- single level inheritance
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("yes it can swim");
    }

}

// multi level inheritance

class Mamel extends Animal{
    int  legs;
}

class Dog extends Mamel{
    String bread;
}

//Heirarachial nheritance 


