import java.util.Scanner;

public class Print1ToN {

//    public static void OnetoN(int n) {
//        if(n == 0){
//            return;
//        }
//        OnetoN(n-1);
//        System.out.println(n);
//       // OnetoN(n-1);
//    }

    public static void print(int x, int n){
        if( x > n) return;  // Base case -- make sure work will done at certain time
        System.out.println(x); // Work
        print(x+1, n); // Call -- Khudd ko call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        print(1,n);
    }
}
