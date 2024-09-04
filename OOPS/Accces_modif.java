package OOPS;

public class Accces_modif {
    public static void main(String args[]){
        BankAccount b1 = new BankAccount();
       // b1.username="vivek";
        //System.out.println(b1.username);
        b1.setPassword("hello bhai");

      
      

    }

}

class BankAccount{
   private  String username ="vivek";
   private String password;
   public void setPassword(String pass){
    password = pass;
    System.out.println(username);
    System.out.println(password);

   }

}
