import java.util.Arrays;

class SecondLargest {

    //bruteforce
    public static int secLargeBruteForce(int arr[]) {
        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++) {
            if(i == arr.length-2) {
                return arr[i];
            }
        }

        return -1;
    }

    //two pass algo
    public static int secLargeTwoPass(int arr[]) {

        int largest = -1, secondLargest = -1;

        for(int i=0; i<arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++) {
            if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    //one pass algo
    public static int secLargeOnePass(int arr[]) {

        int largest = -1, secondLargest = -1;

        // finding the second largest element
        for (int i = 0; i < arr.length; i++) {

            // If arr[i] > largest, update second largest with
            // largest and largest with arr[i]
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
          
            // If arr[i] < largest and arr[i] > second largest, 
            // update second largest with arr[i]
            else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String args[]) {
        
    }
}