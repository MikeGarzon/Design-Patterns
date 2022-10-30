package src;

public class President extends PRHandler{
	static double LIMIT = 4000000;

	  public President(String name) {
	    super(name);
	  }

	  public boolean authorize(PurchaseRequest request) {
	    double amount = request.getAmount();

	    if (amount <= LIMIT) {
	      System.out.println(" src.President & COO " + getName() + " has authorized the PR - " + request + " with PR price of: $" + request.getAmount());
	      return true;
	    } else {
	      System.out.println("PR - " + request + " couldn't be authorized.\n " + "Executive Board needs to be " + "consulted for approval \n" + "reason: Amount too large: $" + request.getAmount());
	      return false;
	    }
	  }
}
// End of class
