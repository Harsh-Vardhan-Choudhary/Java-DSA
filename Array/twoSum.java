import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    
    //bruteforce approach
    public int[] bruteforce(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(target==nums[i]+nums[j]) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    //better approach / optimal approach (if we have to return indexes)
    public int[] better(int[] nums, int target) {
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int currNum = nums[i];
            int neededNum = target-currNum;
            if(mpp.containsKey(neededNum)){
                return new int[]{mpp.get(neededNum), i};
            }
            mpp.put(currNum,i);
        }
        return null;
    }

    //optimal approach - Greedy approach | 2 pointer approach
    public static boolean optimal(int nums[], int target) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length-1;

        while(left<right) {
            int sum = nums[left] + nums[right];

            if(sum == target) {
                return true;
            }

            else if(sum<target) {
                left++;
            }

            else {  //sum>target
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        System.out.println(optimal(nums, target));
    }
    
}
