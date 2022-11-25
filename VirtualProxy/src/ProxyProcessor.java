public class ProxyProcessor extends IDEOperation {
  private RealProcessor realProcessor;

  public void generateDocs(String javaFile) {
    /*
     In order to generate javadocs
     the proxy loads the actual object and
     invokes its methods.
     */

    if (realProcessor == null) {
      realProcessor = new RealProcessor();
    }
    realProcessor.generateDocs(javaFile);
  }
}
