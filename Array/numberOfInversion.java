public class numberOfInversion {

    public static int merge(int arr[], int start, int mid, int end) {

        int temp[] = new int[end-start+1];

        int left = start; 
        int right = mid+1;
        int k = 0;

        int cnt = 0;

        while(left <= mid && right<= end)
        {
            if(arr[left]<=arr[right])              
            {
                temp[k] = arr[left];
                left++;
                k++;
            }
            else                                //arr[left]>arr[right]
            {
                temp[k] = arr[right];
                cnt += (mid-left+1);            //here we are getting the length from the left pointer to the mid, i.e end of left array
                right++;
                k++;
            }
        }

        //baki jo left hai now unke liye

            //if its in left part
            while(left <= mid)
            {
                temp[k++] = arr[left++];
            }

            //if its on right part
            while(right <= end)
            {
                temp[k++] = arr[right++];
            }

        
        //copying temp array into the permanent array
        for(int i=0 ; i<temp.length; i++)
        {
            arr[start + i] = temp[i];
        }
        return cnt;

    }

    public static int mergeSort(int[] arr, int start, int end) {
        int count = 0;

        if(start >= end) {
            return count;
        }

        int mid = (start + end)/2;

        count += mergeSort(arr, start, mid);
        count += mergeSort(arr, mid+1, end);

        count += merge(arr, start, mid, end);

        return count;
    }

    public static int noOFInversion(int arr[]) {
        return mergeSort(arr, 0, arr.length-1);
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        int count = noOFInversion(arr);
        System.out.println("The number of inversions are : " + count);
    }
}
