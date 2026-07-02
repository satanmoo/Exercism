final class MicroBlog {
    public String truncate(final String input) {
        final var result = new StringBuilder();
        final var codePoints = input.codePoints().toArray();
        final var length = Math.min(codePoints.length, 5);
        for (int i = 0; i < length; ++i) {
            result.appendCodePoint(codePoints[i]);
        }

        return result.toString();
    }
}
