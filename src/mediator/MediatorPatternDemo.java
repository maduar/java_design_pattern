package mediator;

/**
 * Created by maduar on 07/11/2017.
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User join = new User("John");

        robert.sendMessage("Hi, John !");
        join.sendMessage("Hello! Robert !");
    }
}
