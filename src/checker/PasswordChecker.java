package checker;

public class PasswordChecker {

    public static void checkStrength(String password) {
        int score = 0;

        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasLower = password.matches(".*[a-z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()].*");
        boolean hasLength = password.length() >= 8;

        if (hasLength) score++;
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;

        System.out.println("\n🔍 Password Analysis:");

        if (score <= 2) {
            System.out.println("Strength: WEAK ❌");
            showSuggestions(hasLength, hasUpper, hasLower, hasDigit, hasSpecial);
        } else if (score <= 4) {
            System.out.println("Strength: MEDIUM ⚠️");
            showSuggestions(hasLength, hasUpper, hasLower, hasDigit, hasSpecial);
        } else {
            System.out.println("Strength: STRONG ✅");
            System.out.println("Good job! Your password is secure.");
        }
    }

    private static void showSuggestions(boolean len, boolean up, boolean low, boolean dig, boolean spec) {
        System.out.println("Suggestions to improve password:");

        if (!len) System.out.println("- Use at least 8 characters");
        if (!up) System.out.println("- Add uppercase letters (A-Z)");
        if (!low) System.out.println("- Add lowercase letters (a-z)");
        if (!dig) System.out.println("- Add numbers (0-9)");
        if (!spec) System.out.println("- Add special characters (!@#$%^&*)");
    }
}
