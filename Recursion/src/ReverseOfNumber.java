public class ReverseOfNumber {

    public static void revOfNumber(int n, int r){
        if (n==0){
            System.out.println(r);
            return;
        }
        revOfNumber(n/10, r*10+n%10);
    }
    public static void main(String[] args) {
        int n = 1234;
//        while (n!=0){
//            r *= 10;
//            r += (n%10);
//            n /= 10;
//        }
        // System.out.println(revOfNumber(n,0));
        revOfNumber(n,0);
    }
}
