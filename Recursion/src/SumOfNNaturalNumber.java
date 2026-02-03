public class SumOfNNaturalNumber {

    static int sumOfN(int n){
        if (n == 0){ // Base case
            return 0;
        }
        return n + sumOfN(n-1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println(sumOfN(5));
    }
}
