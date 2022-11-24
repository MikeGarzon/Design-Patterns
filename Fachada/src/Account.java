package src;

public class Account {

  String firstName;
  String lastName;
  final String ACCOUNT_DATA_FILE = "src/AccountData.txt";

  public Account(String fname, String lname) {
    firstName = fname;
    lastName = lname;
  }
  public boolean isValid() {
    /*
     	Let's go with simpler validation
     	here to keep the example simpler.
     */

    if (getLastName().trim().length() < 6)
      return false;

    return true;
  }
  public boolean save() {
    FileUtil futil = new FileUtil();
    String dataLine = getLastName() + "," + getFirstName();
    return futil.writeToFile(ACCOUNT_DATA_FILE, dataLine,
           true, true);

  }
  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }

}

