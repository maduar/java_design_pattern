package Proxy3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class GamePlayerProxy3 {

  private IGamePlayer gamePlayer;

  public GamePlayerProxy3(IGamePlayer gamePlayer) {
    this.gamePlayer = gamePlayer;
    System.out.println("我是一名代练，我玩的角色是别人的，可以动态传递进来");
  }

  public IGamePlayer getProxy() {
    return (IGamePlayer) Proxy.newProxyInstance(this.getClass().getClassLoader(),
        new Class[] {IGamePlayer.class}, new MyInvocationHandler());
  }

  private class MyInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      if (method.getName().equals("login")) {
        System.out.println("登录时间是: " + new Date().toLocaleString());
      }

      if (method.getName().equals("upgrade")) {
        System.out.println("升级时间是: " + new Date().toString());
      }

      method.invoke(gamePlayer, args);

      return null;
    }
  }
}
