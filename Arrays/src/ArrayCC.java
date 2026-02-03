import java.util.*;

public class ArrayCC {
    public static void main(String[] args) {
       int marks[] = new int[50];
//       int numbers[] = {1, 2, 3};
//       String fruits[] = {"Apple", "Mango", "Orange"};

        Scanner sc = new Scanner(System.in);
        /*
         int phy;
         phy = sc.nextInt();
        */

        marks[0] = sc.nextInt(); //Phy
        marks[1] = sc.nextInt(); //Chem
        marks[2] = sc.nextInt(); //Maths

        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Maths : " + marks[2]);

        // Update marks
        marks[2] = 98;
        System.out.println(marks[2]);
    }
}
