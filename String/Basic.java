package String;
import java.util.*;

public class Basic {

    //printing the string each character

    public static void printStr(String str){
        for (int i =0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }

    //checking the two value
    public static void checkTwono(){
        String str1="vivek";
        String str2="vivek";
        String str3= new String("vivek");
        if(str1==str2){
            System.out.println("true");
        }
        else{
            System.out.println("not true");
        }
        if(str1==str3){
            System.out.println("yes ");

        }
        else{
            System.out.println("not");
        }
    }

    
         
    //checking the palindrome

        public static boolean palindrome(String str){
            for(int i=0;i<str.length();i++){
                int n = str.length();
                if (str.charAt(i)!=str.charAt(n-i-1)){
                    return false;
                }
            }
            System.out.println("helo");
            return true;

        }



        public static void main (String args[]){


        //String str = "abcbas";
        //printStr(str);
       //System.out.println( palindrome(str));
      checkTwono();


    }
    
}
