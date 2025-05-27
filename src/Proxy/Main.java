package Proxy;

public class Main {
    public static void main(String[] args) {
        Car carForUser = new CarProxy("user");
        carForUser.drive();  // 🚫 Доступ запрещён

        Car carForAdmin = new CarProxy("admin");
        carForAdmin.drive(); // Машина поехала 🚗
    }
}
