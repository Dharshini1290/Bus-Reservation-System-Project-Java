abstract class Bank {
    abstract void interest();
}

class SBI extends Bank {
    void interest() {
        System.out.println("Interest Rate = 7%");
    }

    public static void main(String[] args) {
        SBI s = new SBI();
        s.interest();
    }
}
