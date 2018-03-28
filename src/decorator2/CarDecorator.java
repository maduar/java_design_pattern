/*
 *
 * @author maduar
 * @date 27/03/2018 4:08 PM
 * @email maduar@163.com
 *
 * */

package decorator2;

public abstract class CarDecorator implements Car{

  private Car car;

  public CarDecorator(Car car) {
    this.car = car;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }
}
