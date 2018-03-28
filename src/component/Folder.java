package component;

import java.util.ArrayList;
import java.util.List;
/*
 *
 * @author maduar
 * @date 28/03/2018 2:56 PM
 * @email maduar@163.com
 *
 * */
public class Folder extends File {

  private List<File> files;

  public Folder(String name) {
    super(name);
    this.files = new ArrayList<>();
  }

  @Override
  public void display() {
    for (File f : this.files) {
      f.display();
    }
  }

  public void add(File file) {
    this.files.add(file);
  }

  public void remove(File file) {
    this.files.remove(file);
  }
}
