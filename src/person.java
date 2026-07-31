abstract class Person {

    abstract void display();
}

class Student extends Person {

    void display() {
        System.out.println("Student Details");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
