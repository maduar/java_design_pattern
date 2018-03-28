package component;

/*
 *
 * @author maduar
 * @date 28/03/2018 2:55 PM
 * @email maduar@163.com
 *
 * */
public abstract class File {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public File(String name) {

    this.name = name;
  }

  public abstract void display();
}
