public class StringBuilders {
    public static void main(String[] args) {
//        Integer a = 10;
//        a.toString();
//        System.out.println(a);
        StringBuilder sb = new StringBuilder("");

        for(char ch = 'a'; ch<='z'; ch++){ // 0(26)
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
