package All_Question;


public class Factorial {
    public static int fac(int n){
        int f = 1;
        for (int i = 1; i<=n;i++){
            f=f*i;
        }return f;
    }
    public static void main(String args[]){

        int sum = fac(5);
        System.out.println(sum);

    }
    
}
