public class MaximumSumCircularSubarray {

    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int currMin = 0;
        int minSum = Integer.MAX_VALUE;

        for (int num : nums) {
            totalSum += num;
            
            // Kadane's algorithm for maximum subarray sum
            currSum = Math.max(currSum + num, num);
            maxSum = Math.max(maxSum, currSum);

            // Kadane's algorithm for minimum subarray sum
            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);
        }
        if (maxSum < 0) {
            return maxSum; // All numbers are negative
        }   
        return Math.max(maxSum, totalSum - minSum); // Max of non-circular and circular subarray sums
    }

    public static void main(String[] args) {
        MaximumSumCircularSubarray mscs = new MaximumSumCircularSubarray();
        //int[] nums = {1, -2, 3, -2};
        int[] nums = {-5, 3, 5};
       // int[] nums3 = {-3, -2, -3};
        System.out.println(mscs.maxSubarraySumCircular(nums));
    }
}
