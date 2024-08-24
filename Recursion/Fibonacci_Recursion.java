package Recursion;

public class Fibonacci_Recursion {

    public static int fab(int n ){
        if (n==0 || n ==1){
            return n;
        }

        int fnm1= fab(n-1);
        int fnm2=fab(n-2);
        int fibn= fnm1+fnm2;
        return fibn;

    }
    public static void main(String args[]){
        int n = 25;
        System.out.println(fab(n));

    }

     
}