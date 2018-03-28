package observer;

/*
 *
 * @author maduar
 * @date 28/03/2018 4:03 PM
 * @email maduar@163.com
 *
 * */
public class ProgramMonkeyObserver implements Observer{
  @Override
  public void update(String state) {
    System.out.println("Programer look the SDK download preocess is : " + state);
  }
}
