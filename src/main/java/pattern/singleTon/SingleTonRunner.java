package pattern.singleTon;

public class SingleTonRunner {
    public static void main(String[] args) {
        ProgramLogger programLogger = ProgramLogger.getProgramLogger();
        programLogger.addLogInfo("first log...");
        programLogger.addLogInfo("second log...");
        programLogger.addLogInfo("therd log...");
        programLogger.showLogFile();
    }
}
