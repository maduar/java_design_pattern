package facade2;

/*
 *
 * @author maduar
 * @date 28/03/2018 3:42 PM
 * @email maduar@163.com
 *
 * */
public class Facade {
  SubSystemA_Light light;
  SubSystemB_Television television;
  SubSystemC_Aircondition aircondition;

  public Facade(SubSystemA_Light light, SubSystemB_Television television, SubSystemC_Aircondition aircondition) {
    this.light = light;
    this.television = television;
    this.aircondition = aircondition;
  }

  public void on() {
    System.out.println("起床了");
    light.on();
    television.on();
    aircondition.on();
  }

  public void off() {
    System.out.println("睡觉了");
    light.off();
    television.off();
    aircondition.off();
  }
}
