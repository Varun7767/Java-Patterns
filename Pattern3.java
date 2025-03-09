import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter rows: " );
        int num = scanner.nextInt();


        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        scanner.close();
    }
   
}
