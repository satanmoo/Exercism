final class ArmstrongNumbers {

    public boolean isArmstrongNumber(final int numberToCheck) {
        int number = numberToCheck;
        int digitCount = 0;
        while (number > 0) {
            number /= 10;
            digitCount++;
        }

        long maybeArmstrongNumber = 0;
        number = numberToCheck;
        while (number > 0) {
            final int digit = number % 10;
            number /= 10;
            maybeArmstrongNumber += (long) Math.pow(digit, digitCount);
        }

        return maybeArmstrongNumber == numberToCheck;
    }
}
