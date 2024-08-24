package Recursion;

public class SumOfN {

    public static int sumN(int n ){
        if (n == 0){
            return 0;
        }
       int fnm1= sumN(n-1);
       int sn = n +fnm1;
       return sn;

    }

    public static void main (String args[]){
        int n = 5;
        System.out.println(sumN(n));
    }
    
}
