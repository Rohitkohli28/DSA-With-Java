public class FExample3 {

    public static void swap (int a, int b) {
        // Swap logic
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        // Swap -- Exchange value
        int a = 10;
        int b = 5;
        swap(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
