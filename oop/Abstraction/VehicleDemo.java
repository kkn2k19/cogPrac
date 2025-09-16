abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key ignition");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with self start");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}

// e:\Karan_codes\Java\cogPrac\oop\Abstraction>cd
// "e:\Karan_codes\Java\cogPrac\oop\Abstraction\" && javac VehicleDemo.java &&
// java VehicleDemo && del VehicleDemo.class
// Car starts with key ignition
// Bike starts with self start