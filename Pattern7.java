import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= num - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0;  j <= num - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
            
        }
        scanner.close();
    }
}
