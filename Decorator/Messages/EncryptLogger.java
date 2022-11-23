import java.io.*;
import java.util.*;


public class EncryptLogger extends LoggerDecorator {

  public EncryptLogger(Logger inp_logger) {
    super(inp_logger);
  }

  public void log(String DataLine) {
    /*
     	Added functionality
     */
    DataLine = encrypt(DataLine);

    /*
    	Now forward the encrypted text to the FileLogger 
    	for storage
    */
    logger.log(DataLine);
  }
  public String encrypt(String DataLine) {
    /*
     	Apply simple encryption by Transposition...
     	Shift all characters by one position.
     */
    DataLine = DataLine.substring(DataLine.length() - 1) +
               DataLine.substring(0, DataLine.length() - 1);

    return DataLine;
  }

}// end of class

