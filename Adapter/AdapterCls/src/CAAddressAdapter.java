package src;


public class CAAddressAdapter extends CAAddress 
	implements AddressValidator {

  public boolean isValidAddress(String inp_address,
      String inp_zip, String inp_state) {

    return isValidCanadianAddr(inp_address, inp_zip,
           inp_state);
  }
}// end of class


