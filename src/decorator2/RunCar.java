/*
 *
 * @author maduar
 * @date 27/03/2018 4:07 PM
 * @email maduar@163.com
 *
 * */

package decorator2;

public class RunCar implements Car{
  @Override
  public void run() {
    System.out.println("可以跑");
  }

  @Override
  public void show() {
    this.run();
  }
}
