package All_Question;

public class Reverse {
    public static void main(String args[]){
        int n = 10898;
        while(n>0){
            int a = n % 10;
            System.out.println(a);
            n = n / 10;
        }
    }
    
}
