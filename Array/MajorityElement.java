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

    //optimal approach
    public static ArrayList<Integer> optimal(int nums[]) {
        int threshold = nums.length/3;
        ArrayList<Integer> majority = new ArrayList<>();

        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        int cnt1=0;
        int cnt2=0;

        for(int num: nums) {
            if(cnt1==0 && el2!=num) {
                cnt1=1;
                el1 = num;
            }

            else if(cnt2==0 && el1!=num) {
                cnt2=1;
                el2 = num;
            }

            else if(el1 == num) {
                cnt1++;
            }

            else if(el2 == num) {
                cnt2++;
            }

            else {
                cnt1--;
                cnt2--;
            }
        }

        //verifying that the el1 && el2 are majority element
        cnt1=0; cnt2=0;
        for(int num:nums) {
            if(num == el1) cnt1++;
            if(num == el2) cnt2++;
        }

        if(cnt1>threshold) {
            majority.add(el1);
        }

        if(cnt2>threshold) {
            majority.add(el2);
        }

        return majority;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,3,3,2,2,2};
        System.out.println(optimal(arr));
    }
    
}
