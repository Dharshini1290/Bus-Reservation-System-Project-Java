import java.util.Scanner;

class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (pass.equals("java123"))
            System.out.println("Access Granted");
        else
            System.out.println("Access Denied");

        sc.close();
    }
}
