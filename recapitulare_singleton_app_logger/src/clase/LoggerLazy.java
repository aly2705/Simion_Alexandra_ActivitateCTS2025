package clase;

public class LoggerLazy {
    private int totalLogs;
    private static LoggerLazy instance;

    private LoggerLazy() {
        this.totalLogs = 0;
    }

    public static LoggerLazy getInstance(){
        if(instance == null){
            instance = new LoggerLazy();
        }
        return instance;
    }

    public void log(LogLevel level, String message){
        this.totalLogs++;
        StringBuilder sb = new StringBuilder("[LoggerLazy] ");
        sb.append(level.toString()).append(": ").append(message);
        System.out.println(sb);
    }

    public int getTotalLogs() {
        return totalLogs;
    }
}
