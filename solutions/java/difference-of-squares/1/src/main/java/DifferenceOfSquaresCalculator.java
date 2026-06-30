class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        final long sum = (long) input * (input + 1) / 2;
        return (int) (sum * sum);
    }

    int computeSumOfSquaresTo(int input) {
        int sos = 0;
        for (int i = 1; i <= input; ++i) {
            sos += (i * i);
        }

        return sos;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
