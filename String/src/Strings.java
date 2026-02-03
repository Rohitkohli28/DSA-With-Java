import java.util.*;

public class Strings {

    public static void main(String[] args) {
//        char arr[] = {'a', 'b', 'c', 'd'};
//        String str = "abcd";
//        String str2 = new String("xyz");
//
//        Scanner sc = new Scanner(System.in);
//        String name;
//        // name = sc.next();  takes only 1 name after space it not include any string
//        name = sc.nextLine(); // It takes both string
//        System.out.println(name);


        // String length
//        String fullName = "Rohit Kohli";
//        System.out.println(fullName.length());  // Length : 11 (take space also)

        // String concatenation
//        String firstName = "Rohit";
//        String lastName = "Kohli";
//        String fullName = firstName + " " + lastName; // Add both name together
//        System.out.println(fullName);

        // charAt Method
//        String str = "Rohit";
//        System.out.println(str.charAt(2)); // output: h (0 based indexing)

//        // Traversing a string
//        String s = "Hello";
//        for (int i=0; i<s.length(); i++){
//            System.out.print(s.charAt(i) + " ");
//        }
//
        // Reverse a string
        String str = "Hello";
        String rev = " ";

        for (int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}

// String are IMMUTABLE
