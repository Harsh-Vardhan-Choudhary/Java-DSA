public class movingAllZeroToEnd {

    //brute force approach
    static void movingAllZeroToEndBruteForce(int arr[]) {

        //using temp array & a counter of zero
        int[] temp = new int[arr.length];
        int count=0;

        //index track of temp
        int j=0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                temp[j++] = arr[i];
            }

            else{
                count++;
            }
        }

        //filling all the remaining position of temp array
        while(j<temp.length) {
            temp[j] = 0;
            j++;
        }

        //copying temp to original array
        for(int i=0; i<arr.length; i++) {
            arr[i] = temp[i];
        }

    }

    //better approach - two traversal
    static void movingAllZeroToEndTwoTraversal(int arr[]) {

        //here in the first traversal we will copy all the non zero element to starting indexes; here we are ignoring 0's
        //in the second traversal we will fill rest all value with zero

        //count for non-zero element
        int j=0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]!=0) {
                arr[j] = arr[i];
                j++;
            }
        }

        while(j<arr.length) {
            arr[j]=0;
            j++;
        }
    }

    //best approach - one traversal
    static void movingAllZeroToEndOneTraversal(int arr[]) {

        //pointer for swapping
        int j=0;

        for(int i=0; i<arr.length; i++) {

            //here if current index is non-zero then 
            if (arr[i] != 0) {

                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }

            
        }
    }

    static void printArr(int arr[]) {
        for(int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4,6,0,1,0,3};
        printArr(arr);

        movingAllZeroToEndOneTraversal(arr);
        printArr(arr);
    }
    
}
