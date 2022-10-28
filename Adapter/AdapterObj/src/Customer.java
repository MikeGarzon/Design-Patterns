package src;

import java.io.*;
import java.util.*;


class Customer {
  public static final String US = "US";
  public static final String CANADA = "Canada";

  private String address;
  private String name;
  private String zip, state, type;

  public boolean isValidCustomerAddress() {
    if (type.equals(Customer.US)) {
      USAddress us = new USAddress();
      return us.isValidAddress(address, zip, state);
    }
    if (type.equals(Customer.CANADA)) {
      CAAddress objCAAddress = new CAAddress();
      CAAddressAdapter adapter =
        new CAAddressAdapter(objCAAddress);
      return adapter.isValidAddress(address, zip, state);
    }
    return true;
  }

  public Customer(String inp_name, String inp_address,
                  String inp_zip, String inp_state, 
                  String inp_type) {

    name = inp_name;
    address = inp_address;
    zip = inp_zip;
    state = inp_state;
    type = inp_type;
  }
}// end of class


