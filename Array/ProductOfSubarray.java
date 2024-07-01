public class ProductOfSubarray{

    public static int maxProductBruteForce(int[] nums) {
        int product;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            int start = i;
            for(int j=i; j<nums.length; j++) {
                int end = j;
                product=1;
                for(int k=start; k<=end; k++) {
                    product = product * nums[k];
                }
                max = Math.max(product, max);
            }
        }
        return max;
    }

    public static int maxProductBetter(int nums[]){
        int product;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            product = 1;
            for(int j=i; j<nums.length; j++) {
                product = product * nums[j];
                max = Math.max(product, max);
            }
        }
        return max;
    }

    //we can't use khadane algorithm here
    //optimal approach - observation based approach
    public static int maxProductOptimal(int nums[]) {
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;

        for(int i=0; i<nums.length; i++) {

            if(prefix==0) {
                prefix=1;
            }
            if(suffix==0) {
                suffix=1;
            }

            prefix = prefix * nums[i];

            suffix = suffix * nums[nums.length-1-i];

            max = Math.max(max, Math.max(prefix, suffix));
        }

        return max;
    }

    //here int fails for test case {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0} so use double for (max, prefix, suffix)
    //and type cast return to int


    public static void main(String[] args) {
        int nums[] = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        System.out.println(maxProductOptimal(nums));
        System.out.println(maxProductBruteForce(nums));
        System.out.println(maxProductBetter(nums));
    }
}