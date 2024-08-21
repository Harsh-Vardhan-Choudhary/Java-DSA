import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threeSum {

    //bruteforce
    public static List<List<Integer>> bruteForce (int nums[]) {

        Set<List<Integer>> st = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    //better approach - using hashset
    public List<List<Integer>> better(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            Set<Integer> hashset = new HashSet<>();
            for(int j= i+1; j<nums.length; j++) {
                int third = -(nums[i] + nums[j]);
                
                if(hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    st.add(temp);
                }

                hashset.add(nums[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    //optimal approach
    public List<List<Integer>> optimal(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            //skipping the dupplicate values for i
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--;
                } 

                else if (total < 0) {
                    j++;
                } 

                else {
                    
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    res.add(temp);
                    j++;
                    k--;
                    
                    //skip the duplicates for j and k
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return res;        
    }
}
