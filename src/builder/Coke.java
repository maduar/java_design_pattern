package builder;

public class Coke extends ColdDrink{

	@override
	public float price() {
		return 30.0f;
	}
	
	@override 
	public String name() {
		return "Coke";
	}
}
