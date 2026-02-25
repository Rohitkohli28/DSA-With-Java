import java.util.Arrays;

public class NonOverlappingIntervals {

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        // Sort intervals based on their end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        
        int count = 0; // Count of non-overlapping intervals
        int end = intervals[0][1]; // End time of the last added interval
        
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                count++; // Overlapping interval found, increment count
            } else {
                end = intervals[i][1]; // Update end time to the current interval's end
            }
        }
        
        return count; // Return the number of intervals to remove
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,2}, {2,3}, {3,4}, {1,3}};
        System.out.println(eraseOverlapIntervals(intervals));

    }
}
