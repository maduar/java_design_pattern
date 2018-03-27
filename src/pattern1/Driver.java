/*
 *
 * @author maduar
 * @date 27/03/2018 11:58 AM
 * @email maduar@163.com
 *
 * */

package pattern1;

public class Driver implements IDriver{
  @Override
  public void driver(ICar icar) {
    icar.run();
  }
}
