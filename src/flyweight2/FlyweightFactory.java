/*
 *
 * @author maduar
 * @date 27/03/2018 10:05 AM
 * @email maduar@163.com
 *
 * */

package flyweight2;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
  private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

  public Flyweight factory(Character state) {
    // get object from cache
    Flyweight fly = files.get(state);

    if (fly == null) {
      fly = new ConcreteFlyweight(state);
      files.put(state, fly);
    }

    return fly;
  }
}
