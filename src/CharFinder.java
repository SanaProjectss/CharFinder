import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class CharFinder {

    // Finds the first non-repeating character in the string
    public char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        var chars = str.toCharArray();

        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (var ch : chars) {
            if (map.get(ch) == 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }

    // Finds all non-repeating characters in the string
    public List<Character> findAllNonRepeatingChars(String str) {
        Map<Character, Integer> map = new HashMap<>();
        var chars = str.toCharArray();
        List<Character> result = new ArrayList<>();

        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (var ch : chars) {
            if (map.get(ch) == 1) {
                result.add(ch);
            }
        }
        return result;
    }

    // Finds the first non-repeating character, ignoring case and whitespace
    public char findFirstNonRepeatingCharIgnoreCaseAndWhitespace(String str) {
        Map<Character, Integer> map = new HashMap<>();
        var chars = str.toLowerCase().replaceAll("\\s", "").toCharArray();

        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (var ch : chars) {
            if (map.get(ch) == 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }

    // Finds all non-repeating characters, ignoring case and whitespace
    public List<Character> findAllNonRepeatingCharsIgnoreCaseAndWhitespace(String str) {
        Map<Character, Integer> map = new HashMap<>();
        var chars = str.toLowerCase().replaceAll("\\s", "").toCharArray();
        List<Character> result = new ArrayList<>();

        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (var ch : chars) {
            if (map.get(ch) == 1) {
                result.add(ch);
            }
        }
        return result;
    }
}
