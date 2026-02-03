public class Factorial {
    public static int facto (int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;  // Factorial of n
    }

    public static void main(String[] args) {
        System.out.println(facto(4));
    }
}
