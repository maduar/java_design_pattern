package mediator2;

/*
 *
 * @author maduar
 * @date 29/03/2018 1:15 PM
 * @email maduar@163.com
 *
 * */
public class Client {
  public static void main(String[] args) {
    ConcreteMediator mediator = new ConcreteMediator();
    ConcreteColleagueHR hr = new ConcreteColleagueHR("google hr", mediator);
    ConcreteColleagueAndroirDeveloper ad = new ConcreteColleagueAndroirDeveloper("developer", mediator);

    mediator.setAd(ad);
    mediator.setHr(hr);

    hr.constact("hi, i want you");
    ad.constact("is google ?");
    hr.constact("yes. ");
    ad.constact("ok .");
  }
}
