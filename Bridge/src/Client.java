package src;

public class Client {
  public static void main(String[] args) {
    //Create an appropriate implementer object
    MessageLogger loggerF = new FileLogger();
    MessageLogger loggerC = new ConsoleLogger();

    //Choose required interface object and
    // configure it with the implementer object
    Message msgF = new EncryptedMessage(loggerF);
    msgF.log("Testing encrypted message");
    Message msgC = new TextMessage(loggerC);
    msgC.log("Testing text message");
  }
}
