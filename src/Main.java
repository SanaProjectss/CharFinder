import java.util.List;
//2hr 15 min till 3:45

public class Main {
    public static void main(String[] args) {
        CharFinder finder = new CharFinder();

        // Example: Finding the first non-repeating character
        var firstChar = finder.findFirstNonRepeatingChar("Mohammad");
        System.out.println("First non-repeating character: " + firstChar);

        // Example: Finding all non-repeating characters
        List<Character> allChars = finder.findAllNonRepeatingChars("Mohammad");
        System.out.println("All non-repeating characters: " + allChars);

        // Example: Finding the first non-repeating character ignoring case and whitespace
        var firstCharIgnoreCase = finder.findFirstNonRepeatingCharIgnoreCaseAndWhitespace("Mohammad");
        System.out.println("First non-repeating character (ignore case & whitespace): " + firstCharIgnoreCase);

        // Example: Finding all non-repeating characters ignoring case and whitespace
        List<Character> allCharsIgnoreCase = finder.findAllNonRepeatingCharsIgnoreCaseAndWhitespace("Mohammad");
        System.out.println("All non-repeating characters (ignore case & whitespace): " + allCharsIgnoreCase);
    }
}
