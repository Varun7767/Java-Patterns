import java.util.Scanner;

        

        

public class Pattern9 {
    Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); 

    public void Up() {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= num - i -2 ; j++) {
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
    }

    public void down() {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*num - (2*i + 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
   
    public static void main(String[] args) {
        System.out.print("Enter rows: ");   

        Pattern9 pattern = new Pattern9(); 
        pattern.Up(); 
        pattern.down(); 
        
    }
}
