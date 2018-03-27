/*
 *
 * @author maduar
 * @date 27/03/2018 2:03 PM
 * @email maduar@163.com
 *
 * */

package prototype1;

public class Prototype implements Cloneable {
  public Prototype clone() {
    Prototype prototype = null;

    try {
      prototype = (Prototype)super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    return prototype;
  }
}
