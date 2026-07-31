abstract class Animal {
    abstract void sound();
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat Meows");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
    }
}
