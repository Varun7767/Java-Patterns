// Java program to demonstrate Improved method to check if a number is prime
import java.util.Scanner;

// Driver Class
public class GFG {
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n/2
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    // Driver Program
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();

        if (isPrime(num1)) {
            System.out.println(num + " is prime");
        }
        else {
            System.out.println(num + " is not prime");
        }
    }
}

