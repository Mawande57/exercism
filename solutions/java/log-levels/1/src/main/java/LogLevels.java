public class LogLevels {
    
    public static String message(String logLine) {
    String[] tokens = logLine.split(":\\s*", 2); 
    return tokens[1].trim();
}

    public static String logLevel(String logLine) {
    String[] tokens = logLine.split(":\\s*", 2);
    return tokens[0].replace("[", "").replace("]", "").trim().toLowerCase();
}

    public static String reformat(String logLine) {
      String message = message(logLine);
      String level = logLevel(logLine);
      return message + " ("+ level + ")";
    }
}
