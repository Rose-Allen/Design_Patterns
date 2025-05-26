package Decorator;

public class Main {
    public static void main(String[] args) {
        Car myCar = new BasicCar();                              // простая машина
        myCar = new AirConditionerDecorator(myCar);              // добавили кондиционер
        myCar = new NavigatorDecorator(myCar);                   // добавили навигатор
        myCar = new SportPackageDecorator(myCar);                // добавили спорт-пакет

        System.out.println(myCar.getDescription());
        System.out.println("Итоговая цена: " + myCar.getPrice() + " тенге");
    }
}

