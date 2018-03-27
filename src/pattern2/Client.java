/*
 *
 * @author maduar
 * @date 27/03/2018 1:44 PM
 * @email maduar@163.com
 *
 * */

package pattern2;

public class Client {
  public static void main(String[] args) {
    PrettyGirl prettyGirl = new PrettyGirl("Rehana");

    Searcher searcher = new Searcher(prettyGirl);

    searcher.show();
  }
}
