/*
 *
 * @author maduar
 * @date 27/03/2018 1:42 PM
 * @email maduar@163.com
 *
 * */

package pattern2;

public class Searcher extends AbstractSearcher {

  public Searcher(PrettyGirl prettyGirl) {
    super(prettyGirl);
  }

  @Override
  public void show() {
    System.out.println("-------美女的信息如下----------");
    super.prettyGirl.goodLooking();
    super.prettyGirl.niceFigure();
    super.prettyGirl.greatTemperament();
  }
}
