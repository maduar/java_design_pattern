package component;

/*
 *
 * @author maduar
 * @date 28/03/2018 3:01 PM
 * @email maduar@163.com
 *
 * */
public class TextFile extends File{

  public TextFile(String name) {
    super(name);
  }

  @Override
  public void display() {
    System.out.println("这是文本文件，文件名：" + super.getName());
  }
}
