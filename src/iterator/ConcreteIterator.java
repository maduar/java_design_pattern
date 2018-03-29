package iterator;

import java.util.List;

/*
 *
 * @author maduar
 * @date 29/03/2018 11:36 AM
 * @email maduar@163.com
 *
 * */
public class ConcreteIterator implements Iterator {

  private List<Object> list;
  private int cursor;

  public ConcreteIterator(List<Object> list) {
    this.list = list;
  }

  @Override
  public Object first() {
    cursor = 0;
    return this.list.get(cursor);
  }

  @Override
  public Object next() {
    Object ret = null;
    if (hasxNext()) {
      ret = this.list.get(cursor);
    }
    cursor++;
    return ret;
  }

  @Override
  public boolean hasxNext() {
    return !(cursor == this.list.size());
  }

  @Override
  public Object currentItem() {
    return this.list.get(cursor);
  }
}
