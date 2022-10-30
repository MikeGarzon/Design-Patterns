package src;

public class PRManager {

  private BranchManager branchManager;
  private RegionalDirector regionalDirector;
  private VicePresident vicePresident;
  private President president;

  public static void main(String[] args) {
    PRManager manager = new PRManager();
    manager.createAuthorizationFlow();
//First purchase request
    PurchaseRequest request =
      new PurchaseRequest(1, "Office Supplies",10000);
    manager.branchManager.authorize(request);
//Seconf purchase request
    request = new PurchaseRequest(2, "HardWare Procurement", 750000);
    manager.branchManager.authorize(request);
//Third purchase request    
    request = new PurchaseRequest(3, "Aggressive AD Campaign ",8000000);
    manager.branchManager.authorize(request);
//Fourth purchase request
    request = new PurchaseRequest(4, "Data server and Web server",1800000);
    manager.branchManager.authorize(request);
    //Fifth purchase request
    request = new PurchaseRequest(5, "Common AD Campaign ",3800000);
    manager.branchManager.authorize(request);
  }

  public void createAuthorizationFlow() {
    branchManager = new BranchManager("Robin");
    regionalDirector = new RegionalDirector("Oscar");
    vicePresident = new VicePresident("Kate");
    president = new President("Drew");

    branchManager.setNextHandler(regionalDirector);
    regionalDirector.setNextHandler(vicePresident);
    vicePresident.setNextHandler(president);
  }

} // End of class

