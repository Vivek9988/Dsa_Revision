package Sorting;

public class Bubble {

    public static void bubbleSort(int arr[]){
        Boolean val = true;
        for (int i=0;i<arr.length-1;i++){

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    val =false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                
            }
            if (val) {
                System.out.println("aray is sorted");
                break;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        bubbleSort(arr);
        printArr(arr);
    }
    
}
