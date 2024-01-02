import java.util.Arrays;

public class AnagramChecker {

    // public static boolean areAnagrams(String str1, String str2) {
    //     if (str1.length() != str2.length()) {
    //         return false;
    //     }

    //     // Convert strings to char arrays
    //     char[] charArray1 = str1.toCharArray();
    //     char[] charArray2 = str2.toCharArray();

    //     // Sort char arrays
    //     Arrays.sort(charArray1);
    //     Arrays.sort(charArray2);

    //     // Compare sorted char arrays
    //     return Arrays.equals(charArray1, charArray2);
    // }

    public static boolean areAnagrams(String str1, String str2) {
        // Your code here
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i =0 ; i < str1.length() ; i++){
            for(int j =0 ; j < str1.length() ; j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";
        String notAnagram = "hello";

        System.out.println("Are \"" + word1 + "\" and \"" + word2 + "\" anagrams? " + areAnagrams(word1, word2));
        System.out.println("Are \"" + word1 + "\" and \"" + notAnagram + "\" anagrams? " + areAnagrams(word1, notAnagram));
    }
}
