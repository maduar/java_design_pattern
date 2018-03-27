/*
 *
 * @author maduar
 * @date 27/03/2018 1:15 PM
 * @email maduar@163.com
 *
 * */

package pattern1;

public class Client {
  public static void main(String[] args) {
    IDriver zh = new Driver();
//    ICar benz = new Benz();
    ICar bmw = new BMW();

    zh.driver(bmw);
  }
}
