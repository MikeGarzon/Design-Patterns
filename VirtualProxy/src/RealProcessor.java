public class RealProcessor extends IDEOperation {
  /*
    We could remove RealProcessor of being a SubClass of
    IDEOperation, this would improve performance since
    an instance of Compiler and Runtime is not needed because
    the ProxyProcessor already has those instances. But since
    this class was created first we can not change it.
   */
  JavaDoc jdoc;
  public RealProcessor() {
    super();
    jdoc = new JavaDoc();
  }
  public void generateDocs(String javaFile) {
    jdoc.generateDocs(javaFile);
  }
}

