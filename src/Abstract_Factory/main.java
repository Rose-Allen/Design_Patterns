package Abstract_Factory;

public class main {
    public static void main(String[] args) {
        Vehicle factory = new BmwFactory()    ;
        Car car = factory.createCar();
        Bike bike = factory.createBike();

        car.drive();  // Вы едете на BMW машине.
        bike.ride();  // Вы едете на BMW байке.

        // Сменим производителя
        factory = new ToyotaFactory();
        car = factory.createCar();
        bike = factory.createBike();

        car.drive();  // Вы едете на Toyota машине.
        bike.ride();  // Вы едете на Toyota байке.



    }
}
