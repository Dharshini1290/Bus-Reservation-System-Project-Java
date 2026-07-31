import java.util.Scanner;

class SalaryBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        double bonus;

        if (salary >= 50000) {
            bonus = salary * 0.20;   // 20% Bonus
        } else {
            bonus = salary * 0.10;   // 10% Bonus
        }

        double totalSalary = salary + bonus;

        System.out.println("Bonus = " + bonus);
        System.out.println("Total Salary = " + totalSalary);

        sc.close();
    }
}
