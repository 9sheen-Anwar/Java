package Recursion;
import java.util.Scanner;

public class FactorialRecursion {
    public static int printFactorial(int n){
        if(n==0 || n==1)
            return 1;
        return n*printFactorial(n-1);

    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println("Factorial of "+num+" is "+printFactorial(num));
        sc.close();
    }
    
}
