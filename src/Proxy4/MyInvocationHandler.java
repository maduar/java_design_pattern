/*
*
* @author maduar
* @date ${DATE}
*
* */


package Proxy4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

  private Object o;

  public MyInvocationHandler(Object o) {
    this.o = o;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    System.out.println("MyInvocationHandler invoke begin");
    System.out.println("proxy: " + proxy.getClass().getName());
    System.out.println("method: " + method.getName());

//    for(Object o: args) {
//      System.out.println("arg: " + o);
//    }

    method.invoke(o, args);
    System.out.println("MyInvocationHandler invoke end");
    return null;
  }

  public static void main(String[] args) {
    Student s = new Student();

    System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

    ClassLoader loader = Thread.currentThread().getContextClassLoader();
    Class<?>[] interfaces = s.getClass().getInterfaces();

    MyInvocationHandler h = new MyInvocationHandler(s);
    Person proxy = (Person) Proxy.newProxyInstance(loader, interfaces, h);

    proxy.sayHello("haha", 20);
    System.out.println("---------------");
    proxy.sayGoodBye(true, 100);
    System.out.println("end");
  }
}
