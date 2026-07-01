final public class Hamming {
    private final String leftStrand;
    private final String rightStrand;

    public Hamming(final String leftStrand, final String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        int hd = 0;
        for (int i = 0; i < leftStrand.length(); ++i) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                ++hd;
            }
        }

        return hd;
    }
}
