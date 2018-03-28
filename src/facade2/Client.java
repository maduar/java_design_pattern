package facade2;

/*
 *
 * @author maduar
 * @date 28/03/2018 3:45 PM
 * @email maduar@163.com
 *
 * */
public class Client {
  public static void main(String[] args) {

    SubSystemC_Aircondition aircondition = new SubSystemC_Aircondition();
    SubSystemB_Television television = new SubSystemB_Television();
    SubSystemA_Light light = new SubSystemA_Light();

    Facade facade = new Facade(light, television, aircondition);

    facade.on();
    System.out.println("可以看电视");

    facade.off();
    System.out.println("该睡觉了");

  }
}
