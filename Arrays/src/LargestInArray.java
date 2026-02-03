import java.util.*;

public class LargestInArray {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 1; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2 ,6, 3, 5};
        System.out.println("Largest element is: " + getLargest(numbers));
//        int[] arr = {10, 45, 2, 89, 34};
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("Largest Number is: " + max);
    }
}
