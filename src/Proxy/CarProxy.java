package Proxy;

public class CarProxy implements Car {
    private RealCar realCar;
    private String driver;

    public CarProxy(String driver) {
        this.driver = driver;
    }

    public void drive() {
        if (driver.equalsIgnoreCase("admin")) {
            if (realCar == null) {
                realCar = new RealCar();
            }
            realCar.drive();  // Разрешаем доступ
        } else {
            System.out.println("🚫 Доступ запрещён: только админ может водить машину!");
        }
    }
}

