public class IdCard {

  String name;
  String code;
  FlyweightIntr objFW;

  public IdCard(String n, String c, FlyweightIntr fw) {
    name = n;
    code = c;
    objFW = fw;
  }

  public void print() {
    System.out.println("The Universidad Distrital's students are: ");
    System.out.println("Name and lastname: " + name);
    System.out.println("Student code: " + code);
    System.out.println("Faculty: " + objFW.getNameFac());
    System.out.println("Locality: " + objFW.getLocality());
    System.out.println("Address: " + objFW.getAddress());
    System.out.println("Neighbourhood: " + objFW.getNeighbourhood());
    System.out.println("Neighbourhood: " + objFW.getCoordinates());
    System.out.println("----------------");
  }

}
