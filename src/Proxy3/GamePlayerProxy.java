package Proxy3;

public class GamePlayerProxy implements IGamePlayer {

  private IGamePlayer gamePlayer = null;

  public GamePlayerProxy(String username) {
    this.gamePlayer = new GamePlayer(username);
  }

  @Override
  public void login(String user, String password) {
    this.gamePlayer.login(user, password);
  }

  @Override
  public void killBoss() {
    this.gamePlayer.killBoss();
  }

  @Override
  public void upgrade() {
    this.gamePlayer.upgrade();
  }
}
