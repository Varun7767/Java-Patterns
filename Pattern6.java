import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter rows: " );
        int num = scanner.nextInt();


        for (int i = num; i >= 1; i--) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        scanner.close();
    }
   
}

