import java.util.Scanner;

class CollegeAdmission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        if (percentage >= 75) {
            System.out.println("Admission Granted");
        } else {
            System.out.println("Admission Not Granted");
        }

        sc.close();
    }
}
