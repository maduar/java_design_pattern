package builder;

public class Pepsi extends ColdDrink{

	@override
	public float price() {
		return 35.0f;
	}
	
	@override
	public String name() {
		return "Pepsi";
	}
}
