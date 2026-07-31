class Bird {
    void sound() {
        System.out.println("Bird makes sound");
    }
}

class Sparrow extends Bird {
    void sound() {
        System.out.println("Sparrow chirps");
    }
}

class bird {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.sound();
    }
}
