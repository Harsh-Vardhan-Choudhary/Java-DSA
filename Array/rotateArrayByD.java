public class rotateArrayByD {

    //bruteforce | TC: O(n+d) | SC: O(d)
    static void rotate(int[] arr, int d) {

        //temp arr of size d -> element uptil d
        //original array after d to starting position
        //pasting last elements from temp to original array

        int[] temp = new int[d];

        for(int i=0; i<d; i++) {
            temp[i] = arr[i];
        }

        //counter for temp index
        int j=0;

        for(int i=0; i<arr.length; i++) {
            if(i<arr.length-d) {
                arr[i] = arr[i+d];
            }
            else {
                arr[i] = temp[j++];
            }
        }
    }

    //alternative - using swap
    static void rotateSwap(int[] arr, ind d) {

        //swap pointer
        int j=0;

        
    }

    //printing array
    static void printArr(int arr[]) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int d=2; // 3,4,5,1,2

        rotate(array, d);
        printArr(array);
    }
}
