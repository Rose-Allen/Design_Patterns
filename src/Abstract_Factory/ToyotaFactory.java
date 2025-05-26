package Abstract_Factory;

public class ToyotaFactory implements Vehicle{

    @Override
    public Car createCar() {
        return new ToyotaCar();
    }

    @Override
    public Bike createBike() {
        return new ToyotaBike();
    }
}
