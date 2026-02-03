public class Factorial {
    static int fact(int n){
        if(n == 0){ // Base case
            return 1;
        }
        return n * fact(n-1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println("Factorial is : " + fact(5));
    }
}
