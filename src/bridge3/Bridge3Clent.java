/*
 *
 * @author maduar
 * @date 27/03/2018 3:46 PM
 * @email maduar@163.com
 *
 * */

package bridge3;

public class Bridge3Clent {
  public static void main(String[] args) {
    Engine engine100 = new Engine100();
    Engine engine200 = new Engine200();

    Car bus = new Bus(engine100);
    bus.installEngine();

    Car jeep = new Jeep(engine200);
    jeep.installEngine();
  }
}
