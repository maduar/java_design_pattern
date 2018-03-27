/*
 *
 * @author maduar
 * @date 27/03/2018 1:36 PM
 * @email maduar@163.com
 *
 * */

package pattern2;

public class PrettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl{

  private String name;

  public PrettyGirl(String name) {
    this.name = name;
  }

  @Override
  public void goodLooking() {
    System.out.println("---脸蛋很漂亮");
  }

  @Override
  public void niceFigure() {
    System.out.println("---身材非常棒");
  }

  @Override
  public void greatTemperament() {
    System.out.println("---气质非常好");
  }
}
