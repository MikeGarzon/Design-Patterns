package src;

public abstract class PRHandler {
  private PRHandler nextHandler;
  private String handlerName;

  public PRHandler(String name) {
    handlerName = name;
  }
  public String getName() {
    return handlerName;
  }
  public abstract boolean authorize(PurchaseRequest request);
  public PRHandler getNextHandler() {
    return nextHandler;
  }
  public void setNextHandler(PRHandler handler) {
    nextHandler = handler;
  };
}

// End of class

