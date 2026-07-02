class ResistorColorTrio {
    private static final long[] MULTIPLIERS = {
            1L,
            10L,
            100L,
            1_000L,
            10_000L,
            100_000L,
            1_000_000L,
            10_000_000L,
            100_000_000L,
            1_000_000_000L
    };

    String label(String[] colors) {
        var digits = 0L;
        for (int i = 0; i < 2; ++i) {
            digits = 10 * digits + colorCode(colors[i]);
        }

        var zeroCount = colorCode(colors[2]);
        digits *= MULTIPLIERS[zeroCount];

        if (digits >= 1_000_000_000) {
            return (digits / 1_000_000_000) + " gigaohms";
        } else if (digits >= 1_000_000) {
            return (digits / 1_000_000) + " megaohms";
        } else if (digits >= 1_000) {
            return (digits / 1_000) + " kiloohms";
        }

        return digits + " ohms";
    }

    private int colorCode(final String color) {
        switch (color) {
            case "black":
                return 0;
            case "brown":
                return 1;
            case "red":
                return 2;
            case "orange":
                return 3;
            case "yellow":
                return 4;
            case "green":
                return 5;
            case "blue":
                return 6;
            case "violet":
                return 7;
            case "grey":
                return 8;
            case "white":
                return 9;
            default:
                throw new UnsupportedOperationException("unsupported color!");
        }
    }
}
