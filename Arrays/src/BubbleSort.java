public class BubbleSort {
    public static void bubbleSort(int numbers[]){
        int n = numbers.length;;

        for (int i=0; i<n-1; i++){ // Outer Loop
            for (int j=0; j<n-i-1; j++){
                // Adjacent Comparison
                if (numbers[j] > numbers[j+1]){ // If the current element is greater than the next element
                    //Swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = {5, 3, 4, 1, 2};
        bubbleSort(numbers);

        // Output
        for (int num : numbers){
            System.out.print(num + " ");
        }
    }
}
