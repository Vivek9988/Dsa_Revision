package OOPS;

public class Accces_modif {
    public static void main(String args[]){
        BankAccount b1 = new BankAccount();
        //b1.username="vivek";
        //System.out.println(b1.username);
        b1.setPassword("hello bhai");

      
      

    }

}

class BankAccount{
   private  String username ="vivek";
   private String password;
   public void setPassword(String pass){
    password = pass;
    System.out.println(username);      // here i am printing the value of the private string by the help of the function;
    System.out.println(password);

   }

}
