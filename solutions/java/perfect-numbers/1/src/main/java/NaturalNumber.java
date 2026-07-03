import java.util.HashSet;
import java.util.Set;

class NaturalNumber {
    private final int number;
    private final Set<Integer> primes = new HashSet<>();

    NaturalNumber(final int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }

        this.number = number;

        for (int i = 1; i <= number / 2; ++i) {
            if (number % i == 0) {
                this.primes.add(i);
                if (i == 1) {
                    continue;
                }
                this.primes.add(number / i);
            }
        }
    }

    Classification getClassification() {
        if (this.primes.size() == 1) {
            return Classification.DEFICIENT;
        }

        int sum = 0;
        for (int num : this.primes) {
            sum += num;
        }

        if (sum == this.number) {
            return Classification.PERFECT;
        }

        if (sum > this.number) {
            return Classification.ABUNDANT;
        }

        return Classification.DEFICIENT;
    }
}
