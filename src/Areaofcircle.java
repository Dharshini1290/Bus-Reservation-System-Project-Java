import java.util.Scanner;

class Circle {
    double radius;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        radius = sc.nextDouble();
    }

    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getData();
        c.area();
    }
}

