import java.util.Scanner;

class EmployeePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter years of experience: ");
        int experience = sc.nextInt();

        if (experience >= 5) {
            System.out.println("Employee is Eligible for Promotion");
        } else {
            System.out.println("Employee is Not Eligible for Promotion");
        }

        sc.close();
    }
}
