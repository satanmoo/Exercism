final class ReverseString {

    public String reverse(final String inputString) {
        var charArray = inputString.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            final char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }

        return new String(charArray);
    }
}
