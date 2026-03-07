public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int version) {
        // This method is a placeholder for the actual implementation
        // that checks if the given version is bad.
        return false; // Replace with actual logic
    }

    public static void main(String[] args) {
        FirstBadVersion solution = new FirstBadVersion();
        int n = 5; // Example input
        int firstBad = solution.firstBadVersion(n);
        System.out.println("First bad version: " + firstBad);
    }
}
