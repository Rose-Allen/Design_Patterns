package Factory;

public class CarFactory{
    public static Car getCar(String type){
        if(type.equalsIgnoreCase("BMW")){
            return new Bmw();
        }else if(type.equalsIgnoreCase("Toyota")){
            return new Toyota();
        }else{
            return null;
        }
    }
}
