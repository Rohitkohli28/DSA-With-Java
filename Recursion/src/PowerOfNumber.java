public class PowerOfNumber {

    static int powerOfN(int n, int m){
        if(m == 0){
            return 1;
        }
        return n * powerOfN(n,m-1);
    }

    public static void main(String[] args) {
        System.out.println(powerOfN(2,5));
    }
}
