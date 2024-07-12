//Sort an array of 0s, 1s and 2s

public class DutchNationalFlagAlgo {

    public static void sortColors(int[] nums) {
        //using dutch national flag algo
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high) {
            if(nums[mid]==0) {
                swap(nums, mid, low);
                low++;
                mid++;
            }

            else if(nums[mid]==1) {
                mid++;
            }

            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void swap(int nums[], int i, int j) {
        int temp = nums[i]; 
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int nums[] = {1,0,2,2,1,0,1};
        sortColors(nums);

        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
