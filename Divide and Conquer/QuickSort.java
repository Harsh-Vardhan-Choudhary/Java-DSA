public class QuickSort {

    public static int Partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i<j) {
            while(arr[i] <= pivot && i<high) {
                i++;
            }

            while(arr[j] > pivot && j>low) {
                j--;
            }

            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];        //pivot
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void qs(int arr[], int low, int high) {
        if(low<high) {        //until we get the single element array | if low==high, then single element array
            int pIndex = Partition(arr, low, high);
            qs(arr, low, pIndex-1);
            qs(arr, pIndex+1, high);
        }
    }
    
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {4,6,1,3,8,7};

        //calling qs
        qs(arr, 0, arr.length-1);
        printArr(arr);
        
    }
}
