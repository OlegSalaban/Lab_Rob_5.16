import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = (int)(Math.random() * 3) + 1;
        int n2 = (int)(Math.random() * 3) + 1;
        int n3 = (int)(Math.random() * 3) + 1;

        int a1, a2, a3;

        System.out.print("Input n1 > ");
        a1 = scanner.nextInt();

        System.out.print("Input n2 > ");
        a2 = scanner.nextInt();

        System.out.print("Input n3 > ");
        a3 = scanner.nextInt();

        if(a1 == n1 && a2 == n2 && a3 == n3) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("You have 1 try!");

            System.out.print("Input n1 > ");
            a1 = scanner.nextInt();

            System.out.print("Input n2 > ");
            a2 = scanner.nextInt();

            System.out.print("Input n3 > ");
            a3 = scanner.nextInt();

            if(a1 == n1 && a2 == n2 && a3 == n3) {
                System.out.println("Congratulations!");
            } else {
                System.out.println("You lose!");
                System.out.println("True: " + n1 + " " + n2 + " " + n3);
            }
        }
    }
}
