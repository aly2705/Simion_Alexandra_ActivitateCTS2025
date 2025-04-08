package clase;

public class LoggerStaticBlock {
    private static LoggerStaticBlock instance;
    static {
        instance = new LoggerStaticBlock();
    }
    private int totalLogs;

    private LoggerStaticBlock() {
        this.totalLogs = 0;
    }

    public static LoggerStaticBlock getInstance(){
        return instance;
    }

    public void log(LogLevel level, String message){
        this.totalLogs++;
        StringBuilder sb = new StringBuilder("[LoggerStaticBlock] ");
        sb.append(level.toString()).append(": ").append(message);
        System.out.println(sb);
    }

    public int getTotalLogs() {
        return totalLogs;
    }
}
