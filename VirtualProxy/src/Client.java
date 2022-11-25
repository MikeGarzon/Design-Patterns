public class Client {
  public static void main(String[] args) {
    IDEOperation IDE = new ProxyProcessor();
    IDE.compile("test.java");
    IDE.run("test.class");
    IDE.generateDocs("test.java");
  }
}
