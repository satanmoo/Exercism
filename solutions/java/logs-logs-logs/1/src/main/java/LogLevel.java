public enum LogLevel {
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42),
    UNKNOWN("UNKNOWN", 0);

    private final String shortValue;
    private final int encodedValue;

    LogLevel(final String shortValue, final int encodedValue) {
        this.shortValue = shortValue;
        this.encodedValue = encodedValue;
    }

    public String getShortValue() {
        return shortValue;
    }

    public int getEncodedValue() {
        return encodedValue;
    }

    public static LogLevel fromString(final String logLevelStr) {
        for (final LogLevel logLevel : LogLevel.values()) {
            if (logLevel.getShortValue().equals(logLevelStr)) {
                return logLevel;
            }
        }
        return UNKNOWN;
    }
}
