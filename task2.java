import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a word or phrase
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned input is a palindrome
        if (isPalindrome(cleanedInput)) {
            System.out.println("The word or phrase is a palindrome.");
        } else {
            System.out.println("The word or phrase is not a palindrome.");
        }

    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
