final class Darts {
    public int score(final double xOfDart, final double yOfDart) {
        final double distanceFromCenter = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
        if (distanceFromCenter <= 1) {
            return 10;
        } else if (distanceFromCenter <= 5) {
            return 5;
        } else if (distanceFromCenter <= 10) {
            return 1;
        } else {
            return 0;
        }
    }
}
