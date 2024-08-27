import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {

    //bruteforce approach using hashset
    static int removeDuplicatesBruteforce(int[] arr) {
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
    }

    //optimal approach using 2 pointers
    public int removeDuplicatesOptimal(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}