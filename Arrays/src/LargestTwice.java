public class LargestTwice {

    public static int dominantIndex(int[] nums) {
        int max = -1;
        int secondMax = -1;
        int index = -1;

        // Step 1: Find max and second max
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        // Step 2: Check condition
        if (max >= 2 * secondMax) {
            return index;
        }

        return -1;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums1 = {3, 6, 1, 0};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println("Output 1: " + dominantIndex(nums1)); // Expected: 1
        System.out.println("Output 2: " + dominantIndex(nums2)); // Expected: -1
    }
}