interface Payment {
    void pay();   // abstract method by default
}

class UpiPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }

    public static void main(String[] args) {
        Payment p = new UpiPayment();
        p.pay();
    }
}
