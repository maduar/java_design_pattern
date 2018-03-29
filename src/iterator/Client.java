package iterator;

import java.util.ArrayList;
import java.util.List;

/*
 *
 * @author maduar
 * @date 29/03/2018 11:40 AM
 * @email maduar@163.com
 *
 * */
public class Client {
  public static void main(String[] args) {
    List<Object> list = new ArrayList<Object>();
    list.add("Android");
    list.add("PHP");
    list.add("C Language");

    Container container = new ConcreteContainer(list);
    container.add("HardWare");

    Iterator iterator = container.createIterator();
    while (iterator.hasxNext()) {
      System.out.println(iterator.next());
    }
  }
}
