public abstract class NonTerminalExpression 
  implements Expression {
  private Expression leftNode;
  private Expression rightNode;

  public NonTerminalExpression(Expression l, Expression r) {
    setLeftNode(l);
    setRightNode(r);
  }
  public void setLeftNode(Expression node) {
    leftNode = node;
  }
  public void setRightNode(Expression node) {
    rightNode = node;
  }
  public Expression getLeftNode() {
    return leftNode;
  }
  public Expression getRightNode() {
    return rightNode;
  }
}// NonTerminalExpression

class AddExpression extends NonTerminalExpression {
  public int evaluate(Context c) {
    return getLeftNode().evaluate(c) +
           getRightNode().evaluate(c);
  }
  public AddExpression(Expression l, Expression r) {
    super(l, r);
  }
}// AddExpression

class SubtractExpression extends NonTerminalExpression {
  public int evaluate(Context c) {
    return getLeftNode().evaluate(c) -
           getRightNode().evaluate(c);
  }
  public SubtractExpression(Expression l, Expression r) {
    super(l, r);
  }
}// SubtractExpression

class MultiplyExpression extends NonTerminalExpression {
  public int evaluate(Context c) {
    return getLeftNode().evaluate(c) *
           getRightNode().evaluate(c);
  }
  public MultiplyExpression(Expression l, Expression r) {
    super(l, r);
  }

}// MultiplyExpression

