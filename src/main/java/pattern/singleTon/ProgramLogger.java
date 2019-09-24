package pattern.singleTon;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logfile;

    private ProgramLogger() {
    }

    public static synchronized ProgramLogger getProgramLogger() {
        if(programLogger == null) {
            programLogger = new ProgramLogger();
        }
            return programLogger;
    }

    public void addLogInfo(String logInfo) {
        logfile += logInfo;
    }

    public void showLogFile() {
        System.out.println(logfile);
    }


}
