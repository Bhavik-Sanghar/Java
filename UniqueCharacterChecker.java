public class UniqueCharacterChecker {

    public static boolean hasUniqueCharacters(String str) {
        // Your code here
        for(int i =0 ; i < str.length() ; i++){
            for(int j = i+1 ; j < str.length() ; j++){
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String uniqueString = "abcdef";
        String nonUniqueString = "hello";

        System.out.println("Does \"" + uniqueString + "\" have unique characters? " + hasUniqueCharacters(uniqueString));
        System.out.println("Does \"" + nonUniqueString + "\" have unique characters? " + hasUniqueCharacters(nonUniqueString));
    }
}
