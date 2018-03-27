/*
 *
 * @author maduar
 * @date 27/03/2018 2:53 PM
 * @email maduar@163.com
 *
 * */

package adapter2;

public class TestDB2 {
  public static void main(String[] args) {
    DBSocketInterface dbSocket = new DBSocket();
    Hotel hotel = new Hotel(dbSocket);

    hotel.charge();
  }
}
