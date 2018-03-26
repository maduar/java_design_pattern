package proxy1;

import java.util.Scanner;

public class ProxyDemo {
  public static void main(String[] args) {
    String host = "127.0.0.1";
    int port = 8080;
    SocketInterface socket = new SocketProxy(host, port, true);

    String str;
    boolean skip = true;
    while (true) {
      if (skip) {
        skip = !skip;
      } else {
        str = socket.readLine();
        System.out.println("Receive - " + str);
        if(str.equals(null)) {
          break;
        }
      }

      System.out.println("Send ----");
      str = new Scanner(System.in).nextLine();
      socket.writeLine(str);
      if (str.equals("quit")) {
        break;
      }
    }

    socket.dispose();
  }
}
