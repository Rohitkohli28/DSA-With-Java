public class InsertionSort {

    public static void insertionSort(int arr[]){
        int n = arr.length;

        for (int i=0; i<n; i++){
            int key = arr[i]; // Current element

            int j = i-1;

            // Finding out the correct position to insert
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            //Insertion
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
