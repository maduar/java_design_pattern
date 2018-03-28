package component;

/*
 *
 * @author maduar
 * @date 28/03/2018 3:02 PM
 * @email maduar@163.com
 *
 * */
public class ImageFile extends File{
  public ImageFile(String name) {
    super(name);
  }

  @Override
  public void display() {
    System.out.println("这是图像文件，文件名：" + super.getName());
  }
}
