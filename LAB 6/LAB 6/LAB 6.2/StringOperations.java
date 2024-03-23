import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Change the case of the string
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();
        System.out.println("The string after changing the case is: " + str.toUpperCase());

        // Reverse the string
        StringBuilder reversedString = new StringBuilder(str).reverse();
        System.out.println("The string after reversing is: " + reversedString);

        // Compare two strings
        System.out.print("Enter the second string for comparison: ");
        String str2 = scanner.nextLine();
        int difference = Math.abs(str.compareTo(str2));
        System.out.println("The difference between ASCII value is: " + difference);

        // Insert one string into another string
        System.out.print("Enter the string to be inserted into first string: ");
        String insertedString = scanner.nextLine();
        String combinedString = str + " " + insertedString;
        System.out.println("The string after insertion is: " + combinedString);

        // Convert the string to upper case and lower case
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // Check whether the character is present in the string and at which position
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        int position = str.indexOf(ch);
        if (position != -1)
            System.out.println("Position of entered character: " + (position + 1));
        else
            System.out.println("Entered character is not present");

        String reverseStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reverseStr))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");

        int words = str.split("\\s+").length;
        int vowels = str.replaceAll("[^aeiouAEIOU]", "").length();
        int consonants = str.replaceAll("[aeiouAEIOU\\s]", "").length();
        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);

        scanner.close();
    }
}