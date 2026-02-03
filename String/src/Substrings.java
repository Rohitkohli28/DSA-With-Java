public class Substrings {
    public static void main(String[] args) {
        String str = "abcd";

        for (int i=0; i<str.length(); i++){
            for (int j=i+1; j <= str.length(); j++){ // Main logic
                System.out.println(str.substring(i,j));
            }
        }
    }
}
