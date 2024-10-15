package designpatterns.practice.singleton2;

import java.util.Objects;

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

	public void info(String message, Object...inputs) {
		String callingClass = getCallingClass();
		message = substituteValues(message, inputs);

		System.out.println("INFO [" + callingClass + "]: " + message);
	}

	private String substituteValues(String message, Object... inputs) {
		if(message.contains("{}") && inputs.length > 0) {
			for(Object input: inputs) {
				message = message.replaceFirst("\\{\\}", Objects.toString(input));
			}
		}
		return message;
	}

	public void debug(String message, Object...inputs) {
		String callingClass = getCallingClass();
		message = substituteValues(message, inputs);
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
