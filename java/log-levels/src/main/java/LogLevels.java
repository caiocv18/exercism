public class LogLevels {
    static final String[] LEVELS = {"INFO", "WARNING", "ERROR"};


    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":") + 1).trim();
    }

    public static String logLevel(String logLine) {
        for (String level :
                LEVELS) {
            if (logLine.contains(level)) {
                return level.toLowerCase();
            }
        }
        return "Unmapped log";
    }

    public static String reformat(String logLine) {
        return LogLevels.message(logLine)+" ("+LogLevels.logLevel(logLine)+")";
    }
}
