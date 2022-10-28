package src;

import java.io.*;
import java.util.*;


class USAddress extends AddressValidator {

  public boolean isValidAddress(String inp_address,
      String inp_zip, String inp_state) {

    if (inp_address.trim().length() < 10)
      return false;
    if (inp_zip.trim().length() < 5)
      return false;
    if (inp_zip.trim().length() > 10)
      return false;
    if (inp_state.trim().length() != 2)
      return false;

    return true;
  }
}// end of class


