import java.util.Scanner;
import java.util.Stack;

/**
 * A program to check whether a given string is a palindrome using a stack.
 */
public class PalindromeStack
{

    /**
     * Checks if a given string is a palindrome.
     *
     * @param input The input string to check.
     * @return {@code true} if the input is a palindrome, {@code false} otherwise.
     */
    public static boolean isPalindrome(String input) 
    {
        // Create a stack to store characters from input string
        Stack<Character> s = new Stack<>();

        // Edit the input by removing non-alphanumeric characters and converting to lowercase
        String editInput = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Push each character from the edit input string onto the stack
        for (char c : editInput.toCharArray()) 
        {
            s.push(c);
        }

        // Pop characters from the stack and compare with the edit input string
        for (char c : editInput.toCharArray()) 
        {
            if (s.isEmpty() || s.pop() != c)
            {
                return false; // Not a palindrome
            }
        }

        return true; // Palindrome
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();

        if (isPalindrome(input))
        {
            System.out.println("'" + input + "'Input is a palindrome.");
        } else 
        {
            System.out.println("'" + input + "'Input is not a palindrome.");
        }
    }
}
