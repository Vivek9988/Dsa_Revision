package Recursion;

public class Basic {

    public static void printDec(int n ){
     if (n==1){
        System.out.println(1);
        return ;
     }  
        System.out.print(n + " ");
         printDec(n );
        //System.out.print(n +" ");
       

    }
    public static void main(String args[]){
        int n = 10;
        printDec(n);

    }
    
}
