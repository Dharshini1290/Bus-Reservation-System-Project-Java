abstract class Rectangl {
    abstract void area();
}

class Rectangle extends Shape {
    void area() {
        int length = 10, width = 5;
        System.out.println("Area = " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
    }
}