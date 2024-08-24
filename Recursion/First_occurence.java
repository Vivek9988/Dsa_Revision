package Recursion;

public class First_occurence {
    public static int occ(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return occ(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,6};
       System.out.println(occ(arr, 5, 0));
    }
    
}
