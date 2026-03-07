public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        int sum = 0; // Calculate the total sum of the array
        for (int num : nums) { // Iterate through the array and add each number to the sum
            sum += num; // Add the current number to the total sum
        }
        if (sum % 2 != 0) { // If the total sum is not divisible by 2, it cannot be partitioned into two equal subsets
            return false; // Return false if the sum is odd
        }
        int target = sum / 2; // Calculate the target sum for each subset, which is half of the total sum
        boolean[] dp = new boolean[target + 1]; // Create a boolean array of size target + 1
        dp[0] = true; // Initialize the dp array, where dp[i] indicates whether a subset with sum i can be formed

        for (int num : nums) { // Iterate through each number in the input array
            for (int j = target; j >= num; j--) { // Iterate backwards from target to num to avoid overwriting results in the dp array
                dp[j] = dp[j] || dp[j - num]; // Update dp[j] to true if it was already true or if dp[j - num] is true, meaning we can form a subset with sum j by adding num to a subset that forms sum j - num
            }
        }
        return dp[target]; // Return the value of dp[target], which indicates whether a subset with sum equal to target can be formed

    }
    public static void main(String[] args) { // Main method to test the canPartition function
        PartitionEqualSubsetSum solution = new PartitionEqualSubsetSum(); // Create an instance of the PartitionEqualSubsetSum class
        int[] nums = {2, 3, 4, 5, 11, 5}; // Example input array
        System.out.println(solution.canPartition(nums)); // Output: true
    }
}
