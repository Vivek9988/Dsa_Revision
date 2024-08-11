package All_Question;

import java.util.*;

public class PrimeNo {

    public static boolean isprime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % 2 == 0) {
                return false;

            }

        }
        return true;
    }

    // checking prime in a range from 1 to n that which no is prime or not.
    public static void isPrimeNo(int n) {
        for (int i = 0; i <= n; i++) {
            if(isprime(i)){
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       // int a = sc.nextInt();
       isPrimeNo(89);

    }

}
