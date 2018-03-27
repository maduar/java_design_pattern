/*
 *
 * @author maduar
 * @date 27/03/2018 2:49 PM
 * @email maduar@163.com
 *
 * */

package adapter2;

public class DBSocket implements DBSocketInterface{
  @Override
  public void powerWithTwoRound() {
    System.out.println("使用两项圆头的插孔供电");
  }
}
