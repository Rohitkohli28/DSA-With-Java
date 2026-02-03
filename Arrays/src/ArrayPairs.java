public class ArrayPairs {
    public static void printPairs(int numbers[]){
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}
