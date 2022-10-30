package src;

public class PurchaseRequest {
	private int ID;
	  private String description;
	  private double amount;

	  public PurchaseRequest(int id, String desc, double amt) {
	    ID = id;
	    description = desc;
	    amount = amt;
	  }

	  public double getAmount() {
	    return amount;
	  }

	  public String toString() {
	    return ID + ":" + description;
	  }
}
// End of class
