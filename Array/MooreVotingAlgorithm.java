//Find the Majority Element that occurs more than N/2 times

import java.util.HashMap;
import java.util.Map;

public class MooreVotingAlgorithm {

    //Brute Force Algorithm
    public static int BruteForce(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int cnt = 0;
            for(int j=0; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    cnt++;
                }
            }

            if(cnt > (arr.length)/2) {
                return arr[i];
            }
        }

        return -1;
    }

    //Better Soln - using hashmap
    public static int betterSoln(int []arr) {
        // declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // storing the elements with its occurrence:
        for (int i = 0; i < arr.length; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        // searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (arr.length / 2)) {
                return it.getKey();
            }
        }

        return -1;
    }

    //optimal solution - Moore Voting Algorithm
    public static int optimalSoln(int arr[]) {
        int cnt = 0;
        int el = 0;

        for (int i = 0; i < arr.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } 
            
            else if (el == arr[i]) {
                cnt++;
            }
            
            else {
                cnt--;
            }
        }

        //checking if the stored element is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                cnt1++;
            }
        }

        if (cnt1 > (arr.length / 2)) {
            return el;
        }

        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {2,3,2,4,2,5,2};
        int majorityElement = optimalSoln(arr);
        System.out.println(majorityElement);
    }
}