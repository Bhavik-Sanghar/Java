public class WordCounter {

    public static int countWords(String sentence) {
        // Your code here
        // Check for empty or null input
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        // Split the sentence into an array of words using space as a delimiter
        String[] words = sentence.split("\\s+");

        // Return the length of the array, which represents the number of words
        return words.length;
    }

    public static void main(String[] args) {
        String sentence1 = "This is a simple sentence.";
        String sentence2 = "Java programming is fun!";

        System.out.println("Number of words in sentence1: " + countWords(sentence1));
        System.out.println("Number of words in sentence2: " + countWords(sentence2));
    }
}
