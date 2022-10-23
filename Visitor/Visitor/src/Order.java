package src;

public interface Order {
  public void accept(OrderVisitor v);
}
