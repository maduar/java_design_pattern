package factoryMethod;

public class FileLogger implements Logger {

  @Override
  public void writeLog() {
    System.out.println("file logger !!");
  }
}
