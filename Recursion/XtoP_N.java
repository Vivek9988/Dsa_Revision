package Recursion;

public class XtoP_N {

    public static int calPower(int x , int n){
        if (n==1){
            return x;
        }
        int xnm1=calPower(x, n-1);
        int xn = x*xnm1;
        return xn;
    }
    public static void main(String args[]){
       System.out.println(calPower(2, 10));


    }
    
}
