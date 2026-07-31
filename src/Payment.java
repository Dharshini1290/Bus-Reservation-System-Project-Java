abstract class Payment {
    abstract void pay();
}

class UPI extends Payment {
    void pay() {
        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {
        UPI u = new UPI();
        u.pay();
    }
}
