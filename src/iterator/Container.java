package iterator;

/*
 *
 * @author maduar
 * @date 29/03/2018 11:31 AM
 * @email maduar@163.com
 *
 * */
public interface Container {
  void add(Object object);

  void remove(Object object);

  Iterator createIterator();
}
