package Arrays;
import java.util.*;

public class BasicQues {

    // Linear Search

    public static int linearSearch(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }


    //  Largest in array

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int temp;
        for (int i = 0 ; i<numbers.length;i++){
            if (largest<numbers[i]){
                largest =numbers[i];
            }
            
        }
        return largest;
    }


    //Binary Search

    public static int binSearch(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;

        while ( start<=end) {
            int mid = (start + end) / 2;
            if (numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]<key){
                start=mid+1;
            }
            if (numbers[mid]>key){
                end =mid-1;
            }
            
        }
        return -1;
    }

    //Reverse an array.

    public static void reverse(int numbers[]){
        int first = 0;
         int last = numbers.length-1;
        while(first<last){
            int temp= numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;

            first++;
            last--;
        }
       

    }

    // pairs in java

    public static void pair(int numbres[]){
        for (int i = 0 ; i <numbres.length;i++){
            for (int j = i+1;j<numbres.length;j++){
                System.out.print("("+numbres[i] +","+ numbres[j]+")");
            }
            System.out.println();

        }
    }

    // Subarrays in java

    public static void subArrays(int numbers[]){
        for (int i = 0;i<numbers.length;i++){
            for (int j =i;j<numbers.length;j++){
                for (int k = i ;k<=j;k++ ){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

     



    public static void main(String args[]) {
        //int numbres[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        int numbres[]= {2,4,6,8,10};
        // int index = linearSearch(numbres, 9);
        // if (index==-1){
        //     System.out.println("not found ");
        // }
        // else{
        //     System.out.println("found");
        // }


        //System.out.println(getLargest(numbres));

        //System.out.println("The index id "+binSearch(numbres, 9));
        // reverse(numbres);
        // for(int i = 0; i<numbres.length;i++){
        //     System.out.print(numbres[i]+ " ");
        // }

        //pair(numbres);
        subArrays(numbres);

    }

}
