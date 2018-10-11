package primitive_method;

public class CDAccount extends Account {

    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCaluculateInterestRate() {
        return 0.06;
    }
}
