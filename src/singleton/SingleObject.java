package singleton;
//饿汉式
public class SingleObject {
	
	public static SingleObject instance = new SingleObject();
	
	//让构造函数为 private，这样该类就不会被实例化
	private SingleObject() {
		
	}
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
	}
}
