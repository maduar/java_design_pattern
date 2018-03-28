package component;

/*
 *
 * @author maduar
 * @date 28/03/2018 3:03 PM
 * @email maduar@163.com
 *
 * */
public class VideoFile extends File{
  public VideoFile(String name) {
    super(name);
  }

  @Override
  public void display() {
    System.out.println("这是影像文件，文件名：" + super.getName());
  }
}
