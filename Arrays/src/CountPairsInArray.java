public class CountPairsInArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int n = arr.length;

        int totalPairs = n * (n - 1)/2;
        System.out.println("Total pairs are: " + totalPairs);
    }
}
