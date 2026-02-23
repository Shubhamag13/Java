abstract class Vehicle {

    abstract void start();   // abstract method

    void fuelType() {        // concrete method
        System.out.println("Uses fuel");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.fuelType();
    }
}
