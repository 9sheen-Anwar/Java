package Recursion;
public class FibonacciRecursion {
    public static void printFibonacci(int f0,int f1,int n){
        if(n==0){
            return;
    }
    int fibnext=f0+f1;
    System.out.println(fibnext);
    printFibonacci(f1, fibnext, n-1);
    }


    public static void main(String [] args){
        int n=7;
        int f0=0, f1=1;
        System.out.println(f0);
        System.out.println(f1);
        printFibonacci(f0,f1,n-2);

    }
    
}
