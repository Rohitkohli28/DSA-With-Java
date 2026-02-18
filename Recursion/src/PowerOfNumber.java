import java.util.Scanner;

public class PowerOfNumber {

//    static int powerOfN(int n, int m){ 0(b^a)
//        if(m == 0){
//            return 1;
//        }
//        return n * powerOfN(n,m-1);   // a^b = a * a^b-1-==
//    }

// New method -- 0(logn)
    public static int powerOfN(int a, int b){
        if (b == 0) return 1;
        int call = powerOfN(a,b/2);
        if (b % 2 == 0){
            return call * call;
        } else {
            return a * call * call;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter power: ");
        int b = sc.nextInt();
        System.out.println(a + " raised to the power " + b + " is " + powerOfN(a,b));
    }
}
