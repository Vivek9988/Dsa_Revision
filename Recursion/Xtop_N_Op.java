package Recursion;

public class Xtop_N_Op {

    public static int calPowerOp(int x, int n){

        if (n==0){
            return 1;
        }
        int halfPow= calPowerOp(x, n/2);
        int halfPowSq= halfPow*halfPow;
        if(n%2 !=0){
            halfPowSq =x*halfPowSq;
        }
        return halfPowSq;

    }
    public static void main(String args[]){

        System.out.println(calPowerOp(2, 5));
    }
    
}
