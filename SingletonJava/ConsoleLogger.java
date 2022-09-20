public class ConsoleLogger implements Logger {

	private static ConsoleLogger logger;

	  //Prevent clients from using the constructor
	  private ConsoleLogger() {
	  }

	  public static ConsoleLogger getConsoleLogger() {
	    if (logger == null) {
	      logger = new ConsoleLogger();
	    }
	    return logger;
	  }

	  public synchronized void log(String msg) {
		  System.out.println(msg);
	  }

	}
	
 
