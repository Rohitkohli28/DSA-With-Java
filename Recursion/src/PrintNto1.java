public class PrintNto1 {
    static void printNto1(int n) {
        if(n == 0){
            // System.out.println(n);
            return;
        }
       // System.out.println(n + " ");
        // printNto1(n-1);
        System.out.println(n);  // print(n) --> will only print 'n'  but print(n-1) will take care of the rest
        printNto1(n-1); // Subproblem
    }
    public static void main(String[] args) {
        // int n = 10;
        printNto1(10);
    }
}
