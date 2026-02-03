public class KadaneWithIndex {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start =0, end = 0, tempStart = 0;

        for (int i=0; i< arr.length; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }
        }
            System.out.println("Max Sum: " + maxSum);
            System.out.println("SubArray Index: " + start +  " to " + end);
        }
    }
