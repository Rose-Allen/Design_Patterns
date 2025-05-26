package Abstract_Factory;

public class BmwFactory implements Vehicle{

    @Override
    public Car createCar() {
        return new BMWCar();
    }

    @Override
    public Bike createBike() {
        return new BMWBike();
    }
}
