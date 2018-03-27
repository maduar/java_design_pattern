/*
 *
 * @author maduar
 * @date 27/03/2018 10:07 AM
 * @email maduar@163.com
 *
 * */

package flyweight2;

public class Client {
  public static void main(String[] args) {

    FlyweightFactory factory = new FlyweightFactory();

    Flyweight fly = factory.factory(new Character('a'));
    fly.operation("First Call");

    fly = factory.factory(new Character('b'));
    fly.operation("Second Call");

    fly = factory.factory(new Character('c'));
    fly.operation("Third Call");
  }
}
