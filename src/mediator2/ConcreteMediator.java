package mediator2;

/*
 *
 * @author maduar
 * @date 29/03/2018 1:14 PM
 * @email maduar@163.com
 *
 * */
public class ConcreteMediator extends Mediator{

  private ConcreteColleagueHR hr;
  private ConcreteColleagueAndroirDeveloper ad;

  public void setHr(ConcreteColleagueHR hr) {
    this.hr = hr;
  }

  public void setAd(ConcreteColleagueAndroirDeveloper ad) {
    this.ad = ad;
  }

  public ConcreteColleagueHR getHr() {

    return hr;
  }

  public ConcreteColleagueAndroirDeveloper getAd() {
    return ad;
  }

  @Override
  public void constact(String message, Colleague colleague) {
    if (colleague == hr) {
      ad.getMessage(message);
    } else {
      hr.getMessage(message);
    }
  }
}
