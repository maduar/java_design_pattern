package proxy2;

public class ProxySubject extends RealSubject {
  private RealSubject realSubject;

  public ProxySubject() {
  }

  @Override
  public void request() {
    preRequest();
    if (realSubject == null) {
      realSubject = new RealSubject();
    }

    realSubject.request();
    postRequest();
  }

  private void preRequest() {
    System.out.println("before -------");
  }

  private void postRequest() {
    System.out.println("post ----------");
  }
}
