class NeedForSpeed {
    private static final int MAX_BATTERY = 100;

    private final int speed;
    private final int batteryDrain;
    private int distanceDriven;
    private int battery = MAX_BATTERY;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (batteryDrained()) {
            return;
        }
        distanceDriven += speed;
        battery -= batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    int getMaxDistance() {
        return (MAX_BATTERY / batteryDrain) * speed;
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.getMaxDistance() >= distance;
    }
}
