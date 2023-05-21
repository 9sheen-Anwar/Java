package Recursion;
public class PowerRec {

    public static int printPower(int x, int n){
        if(n==0) //base case 1
           return 1;
        if(x==0) //base case 2
            return 0;
        
        return x*printPower(x, n-1);
        

    }
    
    public static void main(String []args){
        int x=4;
        int n=2;
        System.out.println(printPower(x,n));
    }
}
