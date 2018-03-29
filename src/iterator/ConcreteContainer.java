package iterator;

import java.util.List;

/*
 *
 * @author maduar
 * @date 29/03/2018 11:34 AM
 * @email maduar@163.com
 *
 * */
public class ConcreteContainer implements Container {

  private List<Object> list;

  public ConcreteContainer(List<Object> list) {
    this.list = list;
  }

  @Override
  public void add(Object object) {
    list.add(object);
  }

  @Override
  public void remove(Object object) {
    list.remove(object);
  }

  @Override
  public Iterator createIterator() {
    return new ConcreteIterator(list);
  }
}
