package observer;

/*
 *
 * @author maduar
 * @date 28/03/2018 4:07 PM
 * @email maduar@163.com
 *
 * */
public class Client {
  public static void main(String[] args) {

    SDKDownloadSubject sdkDownloadSubject = new SDKDownloadSubject();
    Observer observer = new ProgramMonkeyObserver();
    sdkDownloadSubject.attach(observer);

    sdkDownloadSubject.netProcessChange("1%");
    sdkDownloadSubject.netProcessChange("5%");
    sdkDownloadSubject.netProcessChange("100%");
  }
}
