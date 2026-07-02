final public class PangramChecker {
    private static final int ALPHABET_SIZE = 26;
    private int alphabet = 0;

    public boolean isPangram(final String input) {
        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(c)) {
                alphabet |= (1 << Character.toLowerCase(c) - 'a');
            }
        }

        return alphabet == (1 << ALPHABET_SIZE) - 1;
    }
}
