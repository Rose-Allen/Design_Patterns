package Decorator;

public class AirConditionerDecorator implements Car{
    private Car car;

    public AirConditionerDecorator(Car myCar) {
        this.car = myCar;
    }


    @Override
    public String getDescription() {
        return car.getDescription() + " + кондиционер";
    }

    @Override
    public int getPrice() {
        return car.getPrice() + 200000;
    }
}
