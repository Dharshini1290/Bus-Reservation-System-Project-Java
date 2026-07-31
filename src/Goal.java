import java.util.Scanner;

class Goal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = sc.nextInt();

        if (score >= 50) {
            System.out.println("Goal Achieved");
        } else {
            System.out.println("Goal Not Achieved");
        }

        sc.close();
    }
}