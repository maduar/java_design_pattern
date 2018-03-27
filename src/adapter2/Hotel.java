/*
 *
 * @author maduar
 * @date 27/03/2018 2:51 PM
 * @email maduar@163.com
 *
 * */

package adapter2;

public class Hotel {
  private DBSocketInterface dbSocket;

  public Hotel() {
  }

  public Hotel(DBSocketInterface dbSocket) {
    this.dbSocket = dbSocket;
  }

  public void setDbSocket(DBSocketInterface dbSocket) {
    this.dbSocket = dbSocket;
  }

  public void charge() {
    dbSocket.powerWithTwoRound();
  }
}
