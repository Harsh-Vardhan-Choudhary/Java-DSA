//package Sorting Techniques;

public class InsertionSort
{
    public static void IS(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }
    
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {3, 7, 1, 4, 6, 9};
        IS(arr);
        printArr(arr);
    }
}
