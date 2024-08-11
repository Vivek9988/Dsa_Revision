package Function;

public class Function_over {
      

    public static int sum(int a, int b) {
        return a + b ;
    }

    public static int sum(int a ,int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){

        int add=sum(2, 4);
        System.out.println(add);

        int tat = sum(2,3,4);
        System.out.println(tat);


    }
    
}
