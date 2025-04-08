package clase;

public class LoggerEager {
    private int totalLogs;
    private static LoggerEager instance = new LoggerEager();

    private LoggerEager() {
        this.totalLogs = 0;
    }

    public static LoggerEager getInstance(){
        return instance;
    }

    public void log(LogLevel level, String message){
        this.totalLogs++;
        StringBuilder sb = new StringBuilder("[LoggerEager] ");
        sb.append(level.toString()).append(": ").append(message);
        System.out.println(sb);
    }

    public int getTotalLogs() {
        return totalLogs;
    }
}
