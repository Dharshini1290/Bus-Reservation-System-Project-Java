import java.util.Scanner;

class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        double hra = salary * 0.20;
        double da = salary * 0.10;
        double total = salary + hra + da;

        System.out.println("Total Salary = " + total);

        sc.close();
    }
}

