import java.util.Scanner;

class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Purchase Amount: ");
        double amount = sc.nextDouble();

        if (amount >= 5000)
            System.out.println("Discount = 20%");
        else
            System.out.println("Discount = 10%");

        sc.close();
    }
}
