package state2;

public class Account {
  public AccountState state;// 维持一个对抽象对象的引用
  public String owner; // 开户名
  public double balance = 0; // 账户余额

  public Account(String owner, double init) {
    this.owner = owner;
    this.balance = balance;
    this.state = new NormalState(this); // 设置初始状态
    System.out.println(this.owner + "开户，初始金额为" + init);
    System.out.println("---------------------------------------------");
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    System.out.println(this.owner + "存款" + amount);
    state.deposit(amount); //调用状态对象的deposit()方法
    System.out.println("现在余额为"+ this.balance);
    System.out.println("现在帐户状态为"+ this.state.getClass().getName());
    System.out.println("---------------------------------------------");
  }

  public void withdraw(double amount) {
    System.out.println(this.owner + "取款" + amount);
    state.withdraw(amount); //调用状态对象的withdraw()方法
    System.out.println("现在余额为"+ this.balance);
    System.out.println("现在帐户状态为"+ this. state.getClass().getName());
    System.out.println("---------------------------------------------");
  }

  public AccountState getState() {
    return state;
  }

  public void setState(AccountState state) {
    this.state = state;
  }

  public void computeInterest() {
    state.computeInterest();
  }
}
