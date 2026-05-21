public final class LogLine {
    private final LogLevel logLevel;
    private final String logMessage;

    public LogLine(final String logLine) {
        if (!isValidFormat(logLine)) {
            throw new IllegalArgumentException("Invalid log line format");
        }
        final String logLevelStr = logLine.substring(1, 4);
        logLevel = LogLevel.fromString(logLevelStr);
        logMessage = logLine.substring(7);
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getOutputForShortLog() {
        return logLevel.getEncodedValue() + ":" + logMessage;
    }

    private boolean isValidFormat(String logLine) {
        return logLine != null && logLine.length() >= 7
                && logLine.charAt(0) == '['
                && logLine.charAt(4) == ']'
                && logLine.charAt(5) == ':'
                && logLine.charAt(6) == ' ';
    }
}
