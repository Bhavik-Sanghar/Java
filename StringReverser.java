public class StringReverser {

    public static String reverseString(String input) {
        // Your code here
        String rev = "";
        for(int i = input.length()-1 ; i >= 0 ; i--){
            rev = rev + input.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String originalString = "Hello, World!";

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reverseString(originalString));
    }
}
