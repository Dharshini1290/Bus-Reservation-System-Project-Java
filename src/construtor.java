class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class ConstructorDemo {
    public static void main(String[] args) {
        Student s = new Student("Priyadharshini", 20);
        s.display();
    }
}

