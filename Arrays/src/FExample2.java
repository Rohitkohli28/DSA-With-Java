import java.util.Scanner;

public class FExample2 {
    public static void calculateSum(int num1, int num2) {   // make void as int
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);  // or we can write it as return sum and call it in main class by return sum;
        // return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b); // These are Arguments or actual parameters
        // int sum = calculateSum(a, b);  // when void change in int
        // System.out.println("Sum is : " + sum);
    }
}
