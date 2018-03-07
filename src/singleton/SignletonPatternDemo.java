package singleton;

public class SignletonPatternDemo {
	public static void main(String[] args) {
		SingleObject obj = SingleObject.getInstance();
		obj.showMessage();
	}
}

