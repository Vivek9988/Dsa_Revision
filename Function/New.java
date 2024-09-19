package Function;

public class New {

    public static void arrs(int arr[]){
        arr[0]=2;

    }
    public static void Printarr(int arr[]){
        for (int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        arrs(arr);
        Printarr(arr);

    }
    
}
