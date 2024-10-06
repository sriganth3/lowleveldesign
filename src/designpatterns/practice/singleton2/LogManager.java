package designpatterns.practice.singleton2;

public class LogManager {

    private static volatile LogManager instance;

    private LogManager() {
    	
    }

    public static LogManager getLoggerInstance() {
        if (instance == null) {
            synchronized (LogManager.class) {
                if (instance == null) {
                    instance = new LogManager(); 
                }
            }
        }
        return instance;
    }

    public void info(String message) {
        String callingClass = getCallingClass();
        System.out.println("INFO [" + callingClass + "]: " + message);
    }

    public void debug(String message) {
        String callingClass = getCallingClass();
        System.out.println("DEBUG [" + callingClass + "]: " + message);
    }

    private String getCallingClass() {

        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        

        if (stackTrace.length > 2) {
            return stackTrace[3].getClassName();
        }
        return ""; 
    }
}
