import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter rows: " );
        int num = scanner.nextInt();


        for (int i = 0; i < 2*num - 1; i++) {
            int stars = i;
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
                if (i > num) {
                    System.out.print("* ");    
                }
            }
            System.out.println("");
        }
        scanner.close();
    }
   
}
