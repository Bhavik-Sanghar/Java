public class PasswordChecker {
    public static void main(String[] args) {
        String password1 = "Strosng2P@s";
        String password2 = "Weak123";

        System.out.println(isStrongPassword(password1)); // Should print true
        System.out.println(isStrongPassword(password2)); // Should print false
    }

    public static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
    
        // Check for uppercase, lowercase letters, numbers, and special characters
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;
    
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if ("!@#$%^&*()-_+=<>?/{}[]|".indexOf(ch) >= 0) {
                hasSpecialChar = true;
            }
        }
    
        // Check for at least one uppercase, one lowercase letter, one number, and one special character
        if (!hasUppercase || !hasLowercase || !hasNumber || !hasSpecialChar) {
            return false;
        }
    
        // Check for repeated characters
        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                return false;
            }
        }
    
        // If all criteria are met, return true
        return true;
    }
    
    
    
}
