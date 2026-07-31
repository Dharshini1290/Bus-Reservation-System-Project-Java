import java.util.Scanner;

class StudentCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Tamil Mark: ");
        int tamil = sc.nextInt();

        System.out.print("Enter English Mark: ");
        int english = sc.nextInt();

        System.out.print("Enter Maths Mark: ");
        int maths = sc.nextInt();

        System.out.print("Enter Science Mark: ");
        int science = sc.nextInt();

        System.out.print("Enter Social Mark: ");
        int social = sc.nextInt();

        int total = tamil + english + maths + science + social;
        double average = total / 5.0;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 80) {
            System.out.println("Grade: B");
        } else if (average >= 70) {
            System.out.println("Grade: C");
        } else if (average >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
