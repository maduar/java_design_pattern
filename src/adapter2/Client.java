/*
 *
 * @author maduar
 * @date 27/03/2018 2:59 PM
 * @email maduar@163.com
 *
 * */

package adapter2;

public class Client {
  public static void main(String[] args) {
    GBSocketInterface gbSocket = new GBSocket();

    Hotel hotel = new Hotel();

    SocketAdapter sa = new SocketAdapter(gbSocket);

    hotel.setDbSocket(sa);

    hotel.charge();

  }
}
