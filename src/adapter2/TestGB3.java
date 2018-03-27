/*
 *
 * @author maduar
 * @date 27/03/2018 3:12 PM
 * @email maduar@163.com
 *
 * */

package adapter2;

public class TestGB3 {
  public static void main(String[] args) {
    GBSocketInterface gbSocket = new GBSocket();

    Hotel hotel = new Hotel();
//    hotel.setDbSocket(gbSocket);
    SocketAdapter sa = new SocketAdapter(gbSocket);

  }
}
