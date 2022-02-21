import java.util.*;
/**
 * Author : Nikhil KrishnanVenkatesh (S545019)
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        long factorial = fact(num);
        System.out.println("Factorial of given number is: "+factorial);
        System.out.println("Series of factorial of "+num+" is:");
        for(int i=num; i>=0; i--) {
            long a = fact(i);
            System.out.println("F(" + i + ") = " + a);
        }
    }
    public static long fact(int num)
    {
        if (num >= 1) {
            return num * fact(num - 1);
        }
        else
            return 1;
    }
}
