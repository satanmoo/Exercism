class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder cleaned = new StringBuilder();
        var charArray = identifier.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isWhitespace(c)) {
                cleaned.append('_');
            } else if (c == '-') {
                if (i + 1 < charArray.length && Character.isLetter(charArray[i + 1])) {
                    cleaned.append(Character.toUpperCase(charArray[i + 1]));
                    i++; // Skip the next character as it's already processed
                }
            } else if (Character.isDigit(c)) {
                convertLeetspeakToNormal(cleaned, c);
            } else if (Character.isLetter(c) || c == '_') {
                cleaned.append(c);
            } else {
                // Ignore any other characters
            }
        }

        return cleaned.toString();
    }

    private static void convertLeetspeakToNormal(StringBuilder sb, char c) {
        switch (c) {
            case '4' -> sb.append('a');
            case '3' -> sb.append('e');
            case '0' -> sb.append('o');
            case '1' -> sb.append('l');
            case '7' -> sb.append('t');
            default -> sb.append(c);
        }
    }
}
