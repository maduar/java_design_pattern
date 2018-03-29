package iterator;

/*
 *
 * @author maduar
 * @date 29/03/2018 11:33 AM
 * @email maduar@163.com
 *
 * */
public interface Iterator {
  Object first();

  Object next();

  boolean hasxNext();

  Object currentItem();
}
