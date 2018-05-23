package z_test;

public interface People {

  public String name();
  public int age();

  @Deprecated
  public void work();
}
