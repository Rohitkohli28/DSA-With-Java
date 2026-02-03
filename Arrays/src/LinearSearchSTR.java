public class LinearSearchSTR {
    public static void main(String[] args) {
        String[] names = {"Rohit", "Mohit", "Kajal", "Rohan", "Mohan"};
        String key = "Mohit";

        int index = -1;
        for (int i = 0; i< names.length; i++) {
            if (names[i].equals(key)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found");
        }
    }
}
