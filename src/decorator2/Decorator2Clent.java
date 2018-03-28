/*
 *
 * @author maduar
 * @date 27/03/2018 4:12 PM
 * @email maduar@163.com
 *
 * */

package decorator2;

public class Decorator2Clent {
  public static void main(String[] args) {
    Car car = new RunCar();
    car.show();

    System.out.println("----------");

    Car flyCar = new FlyDecorator(car);
    flyCar.show();

    System.out.println("----------");

    Car flySwimCar = new SwimDecorator(flyCar);
    flySwimCar.show();

  }
}
