package src;

public class Address {

  String address;
  String city;
  String state;

  final String ADDRESS_DATA_FILE = "src/Address.txt";

  public Address(String add, String cty, String st) {
    address = add;
    city = cty;
    state = st;
  }
  public boolean isValid() {
    /*
     	The address validation algorithm
     	could be complex in real-world
     	applications.
     	Let's go with simpler validation
     	here to keep the example simpler.
     */
    if (getState().trim().length() < 2)
      return false;

    return true;
  }
  public boolean save() {
    FileUtil futil = new FileUtil();
    String dataLine = getAddress() + "," + getCity() + "," +
                      getState();
    return futil.writeToFile(ADDRESS_DATA_FILE, dataLine,
           true, true);
  }
  public String getAddress() {
    return address;
  }
  public String getCity() {
    return city;
  }
  public String getState() {
    return state;
  }

}

