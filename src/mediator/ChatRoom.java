package mediator;

import java.util.Date;
/**
 * Created by maduar on 07/11/2017.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
