package primitive_method;

public class Client {

    public static void main(String[] args) {
        Account account = new MoneyMarketAccount();
        System.out.println("Market: " + account.calculateIntrestRate());

        account = new CDAccount();
        System.out.println("cda: " + account.calculateIntrestRate());
    }

}
