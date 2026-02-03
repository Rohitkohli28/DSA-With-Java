public class CountDigit {

    static int countDigit(int n){
        if(n == 0){
            return 0;
        }
        return 1 + countDigit(n/10); // Count 1 digit + count remaining digit
        // 1 + remaining 1234 == 5
        // 1 + remaining 123 == 4 and so on
    }

    public static void main(String[] args) {
        System.out.println(countDigit(12345));
    }
}
