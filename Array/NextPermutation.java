public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        
        int n = nums.length;

        //step1 - finding the breakpoint
        int index = -1;
        for(int i=n-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            reverse(nums, 0, n-1);
            return;
        }

        //step2- swapping the breakpoint
        for(int i=n-1; i>index; i--) {
            if(nums[i] > nums[index]) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        //step3- rest of the element in sorted manner
        reverse(nums, index+1, n-1);
    }

    public static void reverse(int nums[], int start, int end) {
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int nums[] = {4,5,8,5,3};
        nextPermutation(nums);
        
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}