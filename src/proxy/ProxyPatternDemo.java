package proxy;

/**
 * Created by maduar on 02/11/2017.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();
        System.out.println("");
        image.display();
    }
}
