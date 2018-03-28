package component;

/*
 *
 * @author maduar
 * @date 28/03/2018 3:03 PM
 * @email maduar@163.com
 *
 * */
public class Client {
  public static void main(String[] args) {
    Folder all = new Folder("all");
    TextFile textFile = new TextFile("a.txt");
    ImageFile imageFile = new ImageFile("b.jpg");
    Folder cFolder = new Folder("c_file");

    all.add(textFile);
    all.add(imageFile);
    all.add(cFolder);

    TextFile cText = new TextFile("c_1.txt");
    ImageFile cImage = new ImageFile("c_1.jpg");
    VideoFile cVideo = new VideoFile("c_1.rmvb");

    cFolder.add(cText);
    cFolder.add(cImage);
    cFolder.add(cVideo);

    cFolder.display();
    cFolder.remove(cText);
    System.out.println("---------------");
    cFolder.display();

    System.out.println();
    all.display();
  }
}
