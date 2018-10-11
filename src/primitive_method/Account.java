package primitive_method;

public abstract class Account {

    public final double calculateIntrestRate() {

        double interestRate = doCaluculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType);

        return amount * interestRate;
    }

    protected abstract String doCalculateAccountType();

    protected abstract double doCaluculateInterestRate();

    private double calculateAmount(String accountType) {
        return 7243.00;
    }
}
