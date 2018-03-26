package Proxy3;

import java.util.Date;
public class GamePlayerDemo {
  public static void main(String[] args) {
    IGamePlayer proxy = new GamePlayerProxy("X");
    System.out.println("开始时间是: " + new Date().toString());
    proxy.login("ll", "abck");
    proxy.killBoss();
    proxy.upgrade();
    System.out.println("结束时间是: " + new Date().toString());

    System.out.println();


    IGamePlayer proxy2 = new GamePlayerProxy("M");
    proxy2.login("lxx2", "efg");
    proxy2.killBoss();
    proxy2.upgrade();

    System.out.println();

    GamePlayerProxy3 dynamic = new GamePlayerProxy3(new GamePlayer("Y"));
    IGamePlayer dynamicPlayer = dynamic.getProxy();
    dynamicPlayer.login("x333", "sss");
    dynamicPlayer.killBoss();
    dynamicPlayer.upgrade();
  }
}
