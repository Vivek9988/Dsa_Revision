package Recursion;

public class Check {

    public static void main(String args[]){
        int arr[]={1,2,3,4,2,3,4,3,3,4};
        int key = 4;
        for (int i = 0 ; i<arr.length;i++){
            if (i == arr.length&& arr[i]==key) {
                System.out.println(i);
            }
            else {
                System.out.println("hello");
            }
        }
    }
    
}
