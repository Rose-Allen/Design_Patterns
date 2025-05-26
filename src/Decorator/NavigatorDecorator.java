package Decorator;

public class NavigatorDecorator implements Car {
    private Car car;

    public NavigatorDecorator(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + " + навигатор";
    }

    public int getPrice() {
        return car.getPrice() + 150000;
    }
}

