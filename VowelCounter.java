public class VowelCounter {

    public static int countVowels(String str) {
        // Your code here
        int count = 0;
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if the current character is a vowel
            for (char vowel : vowels) {
                if (currentChar == vowel) {
                    count++;
                    break; // Exit the inner loop once a vowel is found
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {
        String text1 = "Hello, World!";
        String text2 = "Java is amazing";

        System.out.println("Number of vowels in text1: " + countVowels(text1));
        System.out.println("Number of vowels in text2: " + countVowels(text2));
    }
}
