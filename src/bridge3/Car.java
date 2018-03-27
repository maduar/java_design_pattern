/*
 *
 * @author maduar
 * @date 27/03/2018 3:43 PM
 * @email maduar@163.com
 *
 * */

package bridge3;

public abstract class Car {
  private Engine engine;

  public Car(Engine engine) {
    this.engine = engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public Engine getEngine() {

    return engine;
  }

  public abstract void installEngine();
}
