import java.util.*;

public class Order implements OrderIF {
  public Vector getAllOrders() {
    FileUtil fileUtil = new FileUtil();
    Vector v = fileUtil.fileToVector("orders.txt");
    return v;
  }
}
