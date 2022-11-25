import java.util.*;

public class OrderProxy implements OrderIF {

  private int counter = 0;
  public Vector getAllOrders() {
    Order order = new Order();  
    counter++;
    System.out.println("Número de veces que se accede al archivo fuente de datos: " + counter);
    long t1 = System.nanoTime();
    System.out.println("Momento en que se accede al archivo fuente de datos: " + t1 + " nanosegundos");
    Vector v = order.getAllOrders();
    long t2 = System.nanoTime();
    System.out.println("Momento después de cargado el archivo fuente de datos: " + t2 + " nanosegundos");
    long timeDiff = t2 - t1;
    System.out.println("Tiempo tomado para cargar el archivo fuente de datos: " + timeDiff + " nanosegundos");
    System.out.println("-----------------------------------------------------------------------------------");
    String msg =
      "Iteration= " + counter + " ::Time= " + timeDiff +
      " nanosegundos";
    //log the message
    FileUtil fileUtil = new FileUtil();
    fileUtil.writeToFile("log.txt",msg, true, true);
    return v;
  }
}
