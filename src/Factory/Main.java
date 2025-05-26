package Factory;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Bmw();
        bmw.drive();
        Car toyota = new Toyota();
        toyota.drive();

        Car bmw1 = CarFactory.getCar("bmw");
        Car toyota1 = CarFactory.getCar("toyota");
        bmw1.drive();
        toyota1.drive();

    }
}
