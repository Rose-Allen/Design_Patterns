package Adapter;

public class Main {
    public static void main(String[] args) {
        OldCar oldCar = new OldCar();
        Car car = new OldCarAdapter(oldCar);
        car.drive();
    }
}
