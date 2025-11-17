class Vehicle{
    String brand;
    
    void start () {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String model;
    String brand;
    String transmission;
    String engine;
    String gascapacity;
    
    
    void displayInfo(){
        System.out.println("Brand: "+ brand);
        System.out.println("Model: " + model);
        System.out.println("Transmission: "+ transmission);
        System.out.println("Engine: "+ engine);
        System.out.println("GasCapacity: "+ gascapacity);
    }
}

public class Main {
    public static void main (String[] args) {
        Car myCar = new Car();
        myCar.brand ="Toyota";
        myCar.model = "Hillux 2.8 GR-S";
        myCar.transmission = "6 Speed AT";
        myCar.engine = "2.8L Diesel, 4-Cylinder, 16 Valve DOHC";
        myCar.gascapacity ="2.8L Diesel";
        
        myCar.start();
        myCar.displayInfo();
    }
}
