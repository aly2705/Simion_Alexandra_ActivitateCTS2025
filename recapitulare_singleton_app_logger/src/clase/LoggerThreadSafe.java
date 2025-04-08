package clase;

public class LoggerThreadSafe {
    private int totalLogs;
    private static LoggerThreadSafe instance;

    private LoggerThreadSafe() {
        this.totalLogs = 0;
    }

    public synchronized static LoggerThreadSafe getInstance(){
        if(instance == null){
            instance = new LoggerThreadSafe();
        }
        return instance;
    }

    public void log(LogLevel level, String message){
        this.totalLogs++;
        StringBuilder sb = new StringBuilder("[LoggerThreadSafe] ");
        sb.append(level.toString()).append(": ").append(message);
        System.out.println(sb);
    }

    public int getTotalLogs() {
        return totalLogs;
    }
}
