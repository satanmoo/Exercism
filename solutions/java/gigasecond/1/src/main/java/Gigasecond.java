import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private static final long GIGASECOND = 1_000_000_000L;
    private final LocalDateTime time;

    public Gigasecond(final LocalDate moment) {
        this.time = moment.atStartOfDay().plusSeconds(GIGASECOND);
    }

    public Gigasecond(final LocalDateTime moment) {
        this.time = moment.plusSeconds(GIGASECOND);
    }

    public LocalDateTime getDateTime() {
        return this.time;
    }
}
