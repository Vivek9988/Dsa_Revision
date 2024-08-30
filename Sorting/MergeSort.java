package Sorting;

public class MergeSort {
    public static void mgSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; // calculating mid
        mgSort(arr, si, mid); // sort left part
        mgSort(arr, mid + 1, ei); // sort right part
        merg(arr, si, mid, ei); // merge sorted parts
    }

    public static void merg(int arr[], int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1]; // corrected size calculation
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp array

        // Merge the two parts into temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left part, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right part, if any
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the merged elements back to the original array
        for (int m = 0; m < temp.length; m++) {
            arr[si + m] = temp[m];
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mgSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
