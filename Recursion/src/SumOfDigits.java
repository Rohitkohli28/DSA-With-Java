public class SumOfDigits {

    static int sumOfDigit(int n) {
        if(n == 0){
            return 0;
        }
        return (n%10) + sumOfDigit(n/10); // n % 10 means last digit which is 3 and n/10 means remove last digit (12)

    }

    public static void main(String[] args) {
        System.out.println("Sum of digit will be: " + sumOfDigit(123));
    }
}
