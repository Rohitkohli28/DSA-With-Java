public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "banana";
        int[] freq = new int[26]; // for a to z

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i=0; i<26; i++){
            if (freq[i] > 0){
                System.out.println((char)(i + 'a') + ":" +freq[i]);
            }
        }
    }
}
