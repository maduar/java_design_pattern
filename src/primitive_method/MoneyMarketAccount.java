package primitive_method;

public class MoneyMarketAccount extends Account {

    @Override
    protected String doCalculateAccountType() {
        return "Money Markey";
    }

    @Override
    protected double doCaluculateInterestRate() {
        return 0.045;
    }
}
