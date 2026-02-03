public class CircularKadane {
    public static void main(String[] args) {
        int [] arr = {8, -1, 3, 4};
        int normalMax = kadane(arr);

        int totalSum = 0;
        for (int i=0; i< arr.length; i++){
            totalSum += arr[i];
            arr[i] = -arr[i]; // Invert array
        }

        int minSubarray = kadane(arr);
        int circularMax = totalSum + minSubarray;
        System.out.println("Maximum Circular Subarray Sum = " + Math.max(normalMax, circularMax));
    }

    public static int kadane(int[] arr) {
        int maxSum = arr[0], currSum = arr[0];

        for (int i=1; i< arr.length; i++){
            currSum = Math.max(arr[i], currSum + arr[i] );
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
