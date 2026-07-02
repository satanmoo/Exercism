final class Acronym {
    private final String phrase;

    Acronym(final String phrase) {
        this.phrase = phrase;
    }

    String get() {
        final var sb = new StringBuilder();

        boolean flag = true;
        for (char c : this.phrase.toCharArray()) {
            if (!Character.isLetter(c)) {
                if (c == ' ' || c == '-' || c == '_') {
                    flag = true;
                }
            } else {
                if (flag) {
                    sb.append(Character.toUpperCase(c));
                    flag = false;
                }
            }
        }

        return sb.toString();
    }
}
