package Decorator;

public class SportPackageDecorator implements Car {
    private Car car;

    public SportPackageDecorator(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + " + спорт-пакет";
    }

    public int getPrice() {
        return car.getPrice() + 350000;
    }
}

