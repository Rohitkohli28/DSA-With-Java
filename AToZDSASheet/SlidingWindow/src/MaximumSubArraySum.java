import java.util.HashSet;

public class MaximumSubArraySum {

    // LeetCode Question no: 2461
    public long maximumSubarraySum(int[] nums, int k) {

        if (nums == null || nums.length < k) return 0;

        HashSet<Integer> set = new HashSet<>();
        long windowSum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Remove duplicates
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            // Add current element
            set.add(nums[right]);
            windowSum += nums[right];

            // If window size exceeds k
            if (right - left + 1 > k) {
                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            // If window size == k
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 5};
    }
}
