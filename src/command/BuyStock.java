package command;

/**
 * Created by maduar on 03/11/2017.
 */
public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
