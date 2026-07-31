class Studentclass {
    String name;
    int age;

    // Constructor
    Studentclass(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class  ConstructorDemo{
    public static void main(String[] args) {
        Studentclass s = new Studentclass("Priyadharshini", 20);
        s.display();
    }
}
