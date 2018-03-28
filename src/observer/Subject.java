package observer;

import java.util.ArrayList;
import java.util.List;

/*
 *
 * @author maduar
 * @date 28/03/2018 4:04 PM
 * @email maduar@163.com
 *
 * */
public abstract class Subject {
  private List<Observer> list = new ArrayList<Observer>();

  public void attach(Observer observer) {
    list.add(observer);
  }

  public void detach(Observer observer) {
    list.remove(observer);
  }

  public void motifyObservers(String newState) {
    for (Observer observer : this.list) {
      observer.update(newState);
    }
  }
}
