import java.util.Arrays;

public class MergeSortedArrays {

    //Bruteforce : O(n+m) + O(n+m)
    public static void mergeBruteForce(int[] nums1, int m, int[] nums2, int n) {
        int nums3[] = new int[m+n];

        int left = 0;       //pointer for nums1
        int right = 0;      //pointer for nums2
        int index = 0;      //pointer for nums3

        while(left<m && right<n) {

            if(nums1[left] < nums2[right]) {
                nums3[index] = nums1[left];
                index++;
                left++;
            }

            else if(nums1[left] > nums2[right]) {
                nums3[index] = nums2[right];
                index++;
                right++;
            }
        }

        //if any element in nums1 is left
        while (left<m) {
            nums3[index++] = nums1[left++];
        }

        //if any element in nums2 is left
        while(right<n) {
            nums3[index++] = nums2[right++];
        }

        //updating nums1 and num2 in accordance to nums3
        for(int i=0; i<n+m; i++) {

            if(i<n) {
                nums1[i] = nums3[i];
            }

            else {
                nums2[i-m] = nums3[i];
            }
        }
    }

    //Optimal1 - Two pointer approach
    public static void mergeOptimal1(int[] nums1, int m, int[] nums2, int n) { 
        int left = m-1;
        int right = 0;

        while(left >= 0 && right <n) {
            if(nums1[left] > nums2[right]) {
                swap(nums1, left, nums2, right);
            }
            left--;
            right++;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
    }

    //swap
    public static void swap(int[] arr1, int n1, int[] arr2, int n2) {
        int temp = arr1[n1];
        arr1[n1] = arr2[n2];
        arr2[n2] = temp;
    }
    
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n1[] = {1,3,5,9};
        int n2[] = {2,7,11,15};

        int m = n1.length;
        int n = n2.length;
        
        System.out.print("n1 array : ");
        printArr(n1);
        System.out.print("n2 array : ");
        printArr(n2);

        mergeOptimal1(n1, m, n2, n);

        System.out.println("After merging");
        System.out.print("n1 array : ");
        printArr(n1);
        System.out.print("n2 array : ");
        printArr(n2);
    }
}
