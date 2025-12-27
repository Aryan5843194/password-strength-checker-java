package checker;

public class PasswordChecker {

    public static void checkStrength(String password) {
        int score = 0;

        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*()].*")) score++;

        if (score <= 2) {
            System.out.println("WEAK");
        } else if (score <= 4) {
            System.out.println("MEDIUM");
        } else {
            System.out.println("STRONG");
        }
    }
}
