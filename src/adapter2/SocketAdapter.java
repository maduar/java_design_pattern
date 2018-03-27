/*
 *
 * @author maduar
 * @date 27/03/2018 2:57 PM
 * @email maduar@163.com
 *
 * */

package adapter2;

public class SocketAdapter implements DBSocketInterface{

  private GBSocketInterface gbSocket;

  public SocketAdapter(GBSocketInterface gbSocket) {
    this.gbSocket = gbSocket;
  }

  @Override
  public void powerWithTwoRound() {
    this.gbSocket.powerWithThreeFlat();
  }
}
