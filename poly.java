class Vehicle {

    // Overloaded methods (Compile-Time Polymorphism)
    void info() {
        System.out.println("This is a vehicle");
    }

    void info(String brand) {
        System.out.println("Brand: " + brand);
    }

    void info(String brand, String model) {
        System.out.println("Brand: " + brand + " Model " + model);
    }

    // Method to be overridden
    void speed() {
        System.out.println("Vehicle has an average speed.");
    }
}

// Subclass 1
class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car runs at 150 km/h.");
    }
}

// Subclass 2
class Motorcycle extends Vehicle {
    @Override
    void speed() {
        System.out.println("Motorcycle runs at 120 km/h.");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle v;

        // Using Car object
        v = new Car();
        v.info();
        v.info("Toyota");
        v.info("Toyota","Hillux 2.8L GR-S" );
        v.speed();

        System.out.println();

        // Using Motorcycle object
        v = new Motorcycle();
        v.info();
        v.info("Honda");
        v.info("Honda", "RS125");
        v.speed();
    }
}
