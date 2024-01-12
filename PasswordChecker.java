public class PasswordChecker {
    public static void main(String[] args) {
        String password1 = "StrongP@ss";
        String password2 = "Weak123";

        System.out.println(isStrongPassword(password1)); // Should print true
        System.out.println(isStrongPassword(password2)); // Should print false
    }

    public static boolean isStrongPassword(String password) {
        // Your implementation here
        // Return true if the password is strong, false otherwise
        if(password.length() < 8 ){
            return false;
        }
        
        return true;

    }
}
