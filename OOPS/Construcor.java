package OOPS;

public class Construcor {
    public static void main(String[] args) {
        // Using Default Constructor also non paremeterised
        Car car1 = new Car();
        car1.displayCarInfo();
        // Using Parameterized Constructor 1
        Car car2 = new Car("Toyota");
        car2.displayCarInfo();

        // Using Parameterized Constructor 2
        Car car3 = new Car("Honda", 2021);
        car3.displayCarInfo();

        // Using Parameterized Constructor 3
        Car car4 = new Car("Ford", 2020, "Red");
        car4.displayCarInfo();
    
}
}

class Car {
    String model;
    int year;
    String color;

    // Default Constructor
    public Car() {
        model = "Unknown";
        year = 0;
        color = "Unspecified";
    }

    // Parameterized Constructor 1
    public Car(String model) {
        this.model = model;
        this.year = 2024; // Default year
        this.color = "Unspecified"; // Default color
    }

    // Parameterized Constructor 2
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Unspecified"; // Default color
    }

    // Parameterized Constructor 3
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void displayCarInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
        
    }
}
