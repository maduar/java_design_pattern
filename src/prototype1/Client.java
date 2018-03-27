/*
 *
 * @author maduar
 * @date 27/03/2018 2:07 PM
 * @email maduar@163.com
 *
 * */

package prototype1;

public class Client {
  public static void main(String[] args) {
    ConcretePrototype cp = new ConcretePrototype();

    for (int i = 0; i < 10; i++) {
      ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
      clonecp.show();
    }
  }
}
