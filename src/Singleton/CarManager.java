package Singleton;

import Abstract_Factory.Car;

public class CarManager {

    private static CarManager instance;

    private CarManager() {
        System.out.println("CarManager создан");
    }

    public static CarManager getInstance() {
        if(instance == null){
            instance = new CarManager();
        }
        return instance;
    }
    public void doSomething() {
        System.out.println("Управление машинами");
    }


}
