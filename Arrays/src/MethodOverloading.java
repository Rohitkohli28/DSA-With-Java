public class MethodOverloading {

    // Function to calculate sum of 2 numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Function to calculate sum of 3 numbers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Function to calculate multiplication of 2 numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
        System.out.println(multiply(10, 2));
        System.out.println(sum(2.3f, 4.6f));
    }
}
