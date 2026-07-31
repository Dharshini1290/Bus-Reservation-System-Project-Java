import java.util.Scanner;

class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        if (balance >= 1000)
            System.out.println("Minimum Balance Maintained");
        else
            System.out.println("Minimum Balance Not Maintained");

        sc.close();
    }
}
