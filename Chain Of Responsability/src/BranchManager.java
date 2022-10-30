package src;

public class BranchManager extends PRHandler{
		  static double LIMIT = 50000;

		  public BranchManager(String name) {
		    super(name);
		  }
		  public boolean authorize(PurchaseRequest request) {
		    double amount = request.getAmount();

		    if (amount <= LIMIT) {
		      System.out.println(" Branch Manager " + getName() + " has authorized the PR - " + request + " with PR price of: $" + request.getAmount());
		      return true;
		    } else {
		      //forward the request to the next handler
		      return getNextHandler().authorize(request);
		    }
		  }
} // End of class

