abstract class Mobile {
    abstract void call();
}

class Android extends Mobile {
    void call() {
        System.out.println("Calling...");
    }

    public static void main(String[] args) {
        Android a = new Android();
        a.call();
    }
}
