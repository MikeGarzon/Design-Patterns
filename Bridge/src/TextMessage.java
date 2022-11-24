package src;

public class TextMessage implements Message {
  private MessageLogger logger;

  public TextMessage(MessageLogger l) {
    logger = l;
  }
  public void log(String msg) {
    String str = preProcess(msg);
    logger.logMsg(str);

  }
  private String preProcess(String msg) {
    return msg;
  };
}
