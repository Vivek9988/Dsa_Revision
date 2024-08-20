package String;

public class Substring {
    public static String subString(String str, int si , int ei){
        String substring ="";
        for(int i=si; i<ei;i++){
            substring +=str.charAt(i);
        }
        return substring;

    }
    public static void main(String args[]){
        String str = "Helloworld";
        // Inbuilt method to print the str
        System.out.println(str.substring(0,6));
        System.out.println(subString(str, 0, 5));
    }

    
}
