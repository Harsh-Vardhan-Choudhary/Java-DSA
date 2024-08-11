//Find the Majority Element that occurs more than N/3 times

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    //brute force approach
    public static ArrayList<Integer> bruteforce(int nums[]) {
        ArrayList<Integer> majority = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(majority.size()==0 || majority.get(0)!=nums[i]) {

                int cnt=0;

                for(int j=0; j<nums.length; j++) {
                    if (nums[j] == nums[i]) {
                        cnt++;
                    }
                }

                if (cnt>nums.length/3) {
                    majority.add(nums[i]);
                }

                if(majority.size()==2) {
                    break;
                }
            }
        }
        
        return majority;
    }

    //better approach using hashmap
    public static ArrayList<Integer> better(int nums[]) {

        int threshold = nums.length/3;
        ArrayList<Integer> majority = new ArrayList<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : nums) {      //using for-each loop
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Find elements that have a frequency greater than N/3
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > threshold) {
                majority.add(entry.getKey());
            }
        }

        return majority;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,3,3,2,2,2};
        ArrayList<Integer> ans = better(arr);
        System.out.println(ans);
    }
    
}
