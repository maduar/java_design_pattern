package observer;

/*
 *
 * @author maduar
 * @date 28/03/2018 4:06 PM
 * @email maduar@163.com
 *
 * */
public class SDKDownloadSubject extends Subject {
  public void netProcessChange(String data) {
    this.motifyObservers(data);
  }
}
