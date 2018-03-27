/*
 *
 * @author maduar
 * @date 27/03/2018 1:41 PM
 * @email maduar@163.com
 *
 * */

package pattern2;

public abstract class AbstractSearcher {
  protected  PrettyGirl prettyGirl;

  public AbstractSearcher(PrettyGirl prettyGirl) {
    this.prettyGirl = prettyGirl;
  }

  public abstract void show();
}
