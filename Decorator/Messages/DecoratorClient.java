class DecoratorClient {

  public static void main(String[] args) {
    LoggerFactory factory = new LoggerFactory();
    Logger logger = factory.getLogger();

    HTMLLogger hLogger = new HTMLLogger(logger);

    //the decorator object provides the same interface.
    hLogger.log("A Message to Log");

    EncryptLogger eLogger = new EncryptLogger(logger);
    eLogger.log("A Message to Log");
  }

} // End of class

