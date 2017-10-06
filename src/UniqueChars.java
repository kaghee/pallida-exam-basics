import java.util.ArrayList;

public class UniqueChars {
    public static void main(String[] args) {
        // Create a function called `uniqueCharacters` that takes a string as parameter
        // and returns a list with the unique letters of the given string
        // Create basic unit tests for it with at least 3 different test cases
        System.out.println(uniqueCharacters(""));
        // Should print out:
        // ["n", "g", "r", "m"]
    }

    public static ArrayList uniqueCharacters(String text) {
        ArrayList<Character> result = new ArrayList<>();
        ArrayList<Character> charsToRemove = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            if (!result.contains(text.charAt(i))) {
                result.add(text.charAt(i));
            } else if (!charsToRemove.contains(text.charAt(i))) {
                charsToRemove.add(text.charAt(i));
            }
        }

        for (int i = 0; i < charsToRemove.size(); i++) {
            result.remove(result.indexOf(charsToRemove.get(i)));
        }
        return result;
    }
}