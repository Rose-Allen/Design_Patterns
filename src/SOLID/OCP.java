package SOLID;


interface Payment {
    void pay(double amount);
}


class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Оплата картой");
    }
}

class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Оплата через PayPal");
    }
}
