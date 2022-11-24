class DecoratorClient {

  public static void main(String[] args) {
    LoggerFactory factory = new LoggerFactory();
    Logger logger = factory.getLogger(); // ConsoleLogger or FileLogger

    HTMLLogger hLogger = new HTMLLogger(logger);
    EncryptLogger eLogger = new EncryptLogger(logger);

    //the decorator object provides the same interface.
    hLogger.log("A Message to Log");
    eLogger.log("A Message to Log");
  }

} // End of class

