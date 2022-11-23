import java.io.*;
import java.util.*;


public class HTMLLogger extends LoggerDecorator {

  public HTMLLogger(Logger inp_logger) {
    super(inp_logger);
  }

  public void log(String DataLine) {
    /*
     	Added functionality
     */
    DataLine = makeHTML(DataLine);

    /*
    	Now forward the encrypted text to the FileLogger 
    	for storage
    */
    logger.log(DataLine);
  }
  public String makeHTML(String DataLine) {
    /*
     	Make it into an HTML document.
     */
    DataLine = "<HTML><BODY>" + "<b>" + DataLine + 
	  "</b>" + "</BODY></HTML>";


    return DataLine;
  }

}// end of class

