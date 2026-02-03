public class InsertionSortRecursive {
    public static void insertionSort(int arr[], int n) {

        // Base case
        if (n <= 1) {
            return;
        }

        // Sort first n-1 element
        insertionSort(arr, n - 1);

        // Insert last element to its correct position
        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }

    public static void main(String[] args) {
        int arr[] = {5,3,4,2,1};
        insertionSort(arr, arr.length);

        // Output
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
