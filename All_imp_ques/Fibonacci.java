package All_imp_ques;

public class Fibonacci {
    public static void main(String args[]){
        int n = 10;
         int first = 0;
         int second = 1;

         for (int i = 2 ; i<=n ; i++ ){
            int next = first+second;
            System.out.println(next+" ");
            first = second;
            second =next;

         }

    }
    
}
