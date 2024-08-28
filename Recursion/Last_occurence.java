package Recursion;

public class Last_occurence {

    public static int lastOcc(int arr[], int key , int i){
        if (i == arr.length){
            return -1;
        }

        int isFound = lastOcc(arr, key, i+1);
        if(isFound== -1){
            return isFound;
        }
        if(arr[i]==key){
            return i;
        }
        return isFound;

    }
    public static void main(String args[]){
        int arr []= {8,8,8};
        System.out.println(lastOcc(arr, 8, 0));

    }
    
}
