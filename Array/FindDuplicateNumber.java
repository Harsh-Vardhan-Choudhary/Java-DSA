import java.util.Arrays;

public class FindDuplicateNumber {

    //BruteForce Approach | TC: O(n) + O(n logn) | SC:O(1)
    public static int findDuplicateBruteForce(int[] nums) {
        
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if(i == nums.length-1) {
                break;
            }

            if(nums[i] == nums[i+1]) {
                return nums[i];
            }
        }

        return -1;
    }

    //Better soln | TC: O(n) | SC : O(n)
    public static int findDuplicateBetter(int[] nums) { 
        int freqArr[] = new int[nums.length];

        for(int i = 0; i<nums.length; i++) {
            if(freqArr[nums[i]] == 0) {
                freqArr[nums[i]] = 1;
            }

            else{
                return nums[i];
            }
        }
        return -1;
    }

    //Optimal soln | TC: O(n) | SC: O(1)
    //Floyd's Tortoise and Hare algorithm - generally used to detect cycle in LL
    public static int findDuplicateOptimal(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];          //moving one step at a time
            fast = nums[nums[fast]];    //moving two steps at a time
        } while(slow != fast);          //here it will detect cycle (slow == fast)

        fast = nums[0];
        while(slow != fast) {           //now each will move one step at a time
            slow = nums[slow];      
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,5,7,4,3,2,6};
        System.out.println(findDuplicateOptimal(nums));
    }
}
