import java.util.Scanner;

class Roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-10): ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Roman = I");
                break;
            case 2:
                System.out.println("Roman = II");
                break;
            case 3:
                System.out.println("Roman = III");
                break;
            case 4:
                System.out.println("Roman = IV");
                break;
            case 5:
                System.out.println("Roman = V");
                break;
            case 6:
                System.out.println("Roman = VI");
                break;
            case 7:
                System.out.println("Roman = VII");
                break;
            case 8:
                System.out.println("Roman = VIII");
                break;
            case 9:
                System.out.println("Roman = IX");
                break;
            case 10:
                System.out.println("Roman = X");
                break;
            default:
                System.out.println("Invalid Number");
        }

        sc.close();
    }
}