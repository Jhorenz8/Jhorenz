abstract class Car {
    String brand = "Toyota";

    abstract void startEngine();
    abstract void stopEngine();
    abstract void gas();
    abstract void transmission();

    void showBrand() {
        System.out.println("Car Brand: " + brand);
    }
}


class ToyotaVios extends Car {

    @Override
    void startEngine() {
        System.out.println("Toyota Hillux engine started using push button.");
    }

    @Override
    void stopEngine() {
        System.out.println("Toyota Hillux engine stopped.");
    }

    void showModel() {
        System.out.println("Model: Toyota Hillux 2.8 GR-S");
    }
    
    void gas() {
        System.out.println("Toyota Hillux having diesel gas");
    }
    
    void transmission() {
        System.out.println("Toyota Hillux transmission up to 6 speed");
    }
}


public class Main {
    public static void main(String[] args) {
        Car myCar = new ToyotaVios();   

        myCar.showBrand();
        myCar.startEngine();
        myCar.stopEngine();
        myCar.gas();
        myCar.transmission();

        
        ((ToyotaVios) myCar).showModel();
    }
}
