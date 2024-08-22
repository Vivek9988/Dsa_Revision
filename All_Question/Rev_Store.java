package All_Question;

public class Rev_Store {
    public static int reverse(int x){
         x = 123456;
        int rev = 0;
        while (x > 0) {
            int a = x % 10;
            rev = (rev * 10) + a;
            x = x / 10;

        }
        return rev;
    }

    public static void main(String args[]){
        int x = 987654;
        System.out.println(reverse(x));
       
    }
    
    
    
}
