public class BubbleSortUsingRecursion {
    public static void bubbleSort(int arr[], int n){
        // Base case
        if(n == 1)
            return;

        // One complete pass
        for (int j=0; j<n-1; j++){
            if (arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        // Recursive call for remaining element
        bubbleSort(arr, n-1);
    }

    public static void main(String[] args) {
        int arr[] = {5,3,4,1,2};
        bubbleSort(arr, arr.length);

        // Output
        for (int num : arr) {
            System.out.print(num + "  ");
        }
    }
}
