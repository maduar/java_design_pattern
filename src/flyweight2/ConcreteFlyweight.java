/*
 *
 * @author maduar
 * @date 27/03/2018 10:03 AM
 * @email maduar@163.com
 *
 * */

package flyweight2;

public class ConcreteFlyweight implements Flyweight {

  private Character intrinsicState = null;

  public ConcreteFlyweight(Character intrinsicState) {
    this.intrinsicState = intrinsicState;
  }

  @Override
  public void operation(String state) {
    System.out.println("Intrinsic State = " + this.intrinsicState);
    System.out.println("Extrinsic State = " + state);
  }
}
