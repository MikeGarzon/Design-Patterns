public abstract class IDEOperation {
  private Compiler cmp;
  private Runtime rtime;

  public void compile(String javaFile) {
    cmp.compile(javaFile);
  }

  public void run(String classFile) {
    rtime.run (classFile);
  }

  //to be delayed until needed.
  public abstract void generateDocs(String javaFile);


  public IDEOperation() {
    cmp = new Compiler();
    rtime = new Runtime();
  }
}

