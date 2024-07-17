public class RepeatedAndMissing {
    public static int[] repeatedNumber(int[] nums) {
        int freqArr[] = new int[nums.length + 1];
        int repeated = 0;
        int missing = 0;
        
        // Find the repeated number
        for (int i = 0; i < nums.length; i++) {
            if (freqArr[nums[i]] == 0) {
                freqArr[nums[i]] = 1;
            } else {
                repeated = nums[i];
            }
        }
        
        // Find the missing number
        for (int i = 1; i <= nums.length; i++) {
            if (freqArr[i] == 0) {
                missing = i;
                break;
            }
        }
        
        return new int[] {repeated, missing};
    }

    public static void main(String[] args) {
        int nums[] = {3,1,2,5,3};
        int[] res = repeatedNumber(nums);

        System.out.println(res.length);
    }
}
