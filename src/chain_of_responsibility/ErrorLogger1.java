package chain_of_responsibility;

/**
 * Created by maduar on 02/11/2017.
 */
public class ErrorLogger1 extends AbstractLogger {

    public ErrorLogger1(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
