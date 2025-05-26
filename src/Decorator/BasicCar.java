package Decorator;

public class BasicCar implements Car {
    @Override
    public String getDescription() {
        return "basic car";
    }

    @Override
    public int getPrice() {
        return 50000000;
    }
}
