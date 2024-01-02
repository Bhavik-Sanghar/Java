public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        // Your code here
        str = str.toLowerCase().replaceAll("\\s", ""); // Convert to lowercase and remove spaces

        for (int i = 0; i < str.length() / 2; i++) {
            char startChar = str.charAt(i);
            char endChar = str.charAt(str.length() - 1 - i);

            if (startChar != endChar) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String palindrome1 = "racecar";
        String palindrome2 = "A man a plan a canal Panama";
        String notPalindrome = "hello";

        System.out.println("Is \"" + palindrome1 + "\" a palindrome? " + isPalindrome(palindrome1));
        System.out.println("Is \"" + palindrome2 + "\" a palindrome? " + isPalindrome(palindrome2));
        System.out.println("Is \"" + notPalindrome + "\" a palindrome? " + isPalindrome(notPalindrome));
    }
}
