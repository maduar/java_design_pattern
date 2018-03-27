/*
 *
 * @author maduar
 * @date 27/03/2018 3:44 PM
 * @email maduar@163.com
 *
 * */

package bridge3;

public class Jeep extends Car {
  public Jeep(Engine engine) {
    super(engine);
  }

  @Override
  public void installEngine() {
    System.out.println("Jeep: ");
    this.getEngine().installEngine();
  }
}
