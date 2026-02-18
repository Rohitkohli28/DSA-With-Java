import java.util.Arrays;

// Leetcode - Question 3 --> Longest Substring Without Repeating Characters
public class LongestSubstringLength {

    public int longestNonRepeatingSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;

        int n = s.length();
        int HashLen = 256;

        int[] hash = new int[HashLen];

        Arrays.fill(hash, -1);

        while (right < n ){
            if(hash[s.charAt(right)] >= left){
                left = Math.max(hash[s.charAt(right)] + 1, left);
            }

            int len = right - left + 1;
            maxLen = Math.max(len, maxLen);

            hash[s.charAt(right)] = right;
            right++;

        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        // Create an instance of the Solution class
        LongestSubstringLength sol = new LongestSubstringLength();

        int result = sol.longestNonRepeatingSubstring(s);

        // Output the maximum length
        System.out.println("The maximum length is:");
        System.out.println(result);
    }
}
