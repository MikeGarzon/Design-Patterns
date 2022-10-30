package src;

public class RegionalDirector extends PRHandler{
	static double LIMIT = 1000000;

	  public RegionalDirector(String name) {
	    super(name);
	  }

	  public boolean authorize(PurchaseRequest request) {
	    double amount = request.getAmount();

	    if (amount <= LIMIT) {
	      System.out.println(" Regional Director " + getName() + " has authorized the PR - " + request + " with PR price of: $" + request.getAmount());
	      return true;
	    } else {
	      //forward the request to the next handler
	      return getNextHandler().authorize(request);
	    }
	  }
}
//End of class