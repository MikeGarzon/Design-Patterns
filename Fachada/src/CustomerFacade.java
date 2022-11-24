package src;

public class CustomerFacade {

  private String address;
  private String city;
  private String state;
  private String cardType;
  private String cardNumber;
  private String cardExpDate;
  private String fname;
  private String lname;

  public void setAddress(String inAddress) {
    address = inAddress;
  }
  public void setCity(String inCity) {
    city = inCity;
  }
  public void setState(String inState) {
    state = inState;
  }
  public void setFName(String inFName) {
    fname = inFName;
  }
  public void setLName(String inLName) {
    lname = inLName;
  }
  public void setCardType(String inCardType) {
    cardType = inCardType;
  }
  public void setCardNumber(String inCardNumber) {
    cardNumber = inCardNumber;
  }
  public void setCardExpDate(String inCardExpDate) {
    cardExpDate = inCardExpDate;
  }

  public boolean saveCustomerData() {

    Address objAddress;
    Account objAccount;
    CreditCard objCreditCard;

    /*
    	client is transparent from the following
    	set of subsystem related operations.
    */

    boolean validData = true;
    String errorMessage = "";

    objAccount = new Account(fname, lname);
    if (objAccount.isValid() == false) {
      validData = false;
      errorMessage = "Invalid FirstName/LastName";
    }

    objAddress = new Address(address, city, state);
    if (objAddress.isValid() == false) {
      validData = false;
      errorMessage = "Invalid Address/City/State";
    }

    objCreditCard = new CreditCard(cardType, cardNumber,
                    cardExpDate);
    if (objCreditCard.isValid() == false) {
      validData = false;
      errorMessage = "Invalid CreditCard Info";
    }

    if (!validData) {
      System.out.println(errorMessage);
      return false;
    }

    if (objAddress.save() && objAccount.save() &&
        objCreditCard.save()) {

      return true;
    } else {
      return false;
    }

  }

}

