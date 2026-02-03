public class Multiply {
    public static int mul (int a, int b) {
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        int prod = mul(3, 5);
        System.out.println("Value after multiply is: " + prod);
    }
}
