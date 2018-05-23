package state2;

public class Client {

  public static void main(String[] args) {
    Account acc = new Account("maduar", 0.0);
    acc.deposit(1000);
    acc.withdraw(2000);
    acc.withdraw(2000);
    acc.withdraw(2000);
    acc.computeInterest();
  }
}
