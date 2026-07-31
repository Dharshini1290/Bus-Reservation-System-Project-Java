import java.util.Scanner;

class StringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("Length: " + str.length());
        System.out.println("Upper Case: " + str.toUpperCase());
        System.out.println("Lower Case: " + str.toLowerCase());
        System.out.println("First Character: " + str.charAt(0));
        System.out.println("Contains 'a': " + str.contains("a"));

        sc.close();
    }
}