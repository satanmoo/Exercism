public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double baseRate = 221 * speed;
        if (speed <= 4) {
            return baseRate;
        } else if (speed <= 8) {
            return baseRate * 0.9;
        } else if (speed == 9) {
            return baseRate * 0.8;
        } else if (speed == 10) {
            return baseRate * 0.77;
        } else {
            throw new IllegalArgumentException("Speed must be between 0 and 10 inclusive.");
        }
    }


    public int workingItemsPerMinute(int speed) {
        double ratePerHour = productionRatePerHour(speed);
        return (int) (ratePerHour / 60);
    }
}
