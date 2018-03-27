/*
 *
 * @author maduar
 * @date 27/03/2018 3:45 PM
 * @email maduar@163.com
 *
 * */

package bridge3;

public class Bus extends Car{
  public Bus(Engine engine) {
    super(engine);
  }

  @Override
  public void installEngine() {
    System.out.println("Bus: ");
    this.getEngine().installEngine();
  }
}
