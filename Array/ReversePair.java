public class ReversePair {

    public void merge(int nums[], int start, int mid, int end) {
        
        int temp[] = new int[end-start+1];
        int left = start;           //iterator for left partitioned array
        int right = mid+1;          //iterator for right partitioned array
        int k = 0;                  //iterator for temp arr

        while(left <= mid && right <= end) {
            if(nums[left] <= nums[right]) {
                temp[k] = nums[left];
                left++;
                k++;
            }
            else {
                temp[k] = nums[right];
                right++;
                k++;
            }
        }

        //if any element in left partitioned array left
        while(left <= mid) {
            temp[k++] = nums[left++];
        }

        //if any element in right partitioned array is left
        while(right <= end) {
            temp[k++] = nums[right++];
        }

        //put the value of temp array in final array
        for(int i=0; i<temp.length; i++) {
            nums[start+i] = temp[i];
        }
    }

    public int countPairs(int nums[], int start, int mid, int end) {
        int cnt = 0;

        // Count the reverse pairs
        int right = mid + 1;
        for (int i = start; i <= mid; i++) {
            //here type casting to long for the cases where int value is too large
            while (right <= end && (long)nums[i] > 2 * (long)nums[right]) {     
                right++;
            }
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    public int ms(int nums[], int start, int end) {
        //we will use merge sort
        int count = 0;

        //base case
        if(start >= end) {
            return count;
        }

        int mid = (start+end)/2;

        count += ms(nums, start, mid);
        count += ms(nums, mid+1, end);
        count += countPairs(nums, start, mid, end);
        merge(nums, start, mid, end);

        return count;
    }

    public int reversePairs(int[] nums) {
        return ms(nums, 0, nums.length-1);
    }
}