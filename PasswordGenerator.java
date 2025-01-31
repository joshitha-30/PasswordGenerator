import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the password:");
        int length = scanner.nextInt();

        System.out.println("Do you want to include:");
        System.out.println("1. Uppercase letters");
        System.out.println("2. Numbers");
        System.out.println("3. Special characters");
        System.out.println("Enter your choices (separate with spaces):");
        String choices = scanner.next();

        String password = generatePassword(length, choices);
        System.out.println("Generated password: " + password);
    }

    public static String generatePassword(int length, String choices) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder password = new StringBuilder();

        if (choices.contains("1")) {
            chars += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (choices.contains("2")) {
            chars += "0123456789";
        }
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            password.append(chars.charAt(random.nextInt(chars.length())));
        }

        return password.toString();
    }
}