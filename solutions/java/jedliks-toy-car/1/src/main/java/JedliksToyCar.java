public class JedliksToyCar {
    private int batteryPercentage = 100;
    private int distance = 0;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " +
                distance +
                " meters";
    }

    public String batteryDisplay() {
        var sb = new StringBuilder();

        if (batteryPercentage == 0) {
            sb.append("Battery empty");
            return sb.toString();
        }

        sb.append("Battery at ");
        sb.append(batteryPercentage);
        sb.append("%");
        return sb.toString();
    }

    public void drive() {
        if (this.batteryPercentage == 0) {
            return;
        }

        this.distance += 20;
        this.batteryPercentage -= 1;
    }
}
