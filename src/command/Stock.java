package command;

/**
 * Created by maduar on 03/11/2017.
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
