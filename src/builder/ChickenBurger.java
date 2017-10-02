package builder;

public class ChickenBurger extends Burger{

	@override
	public float price() {
		return 50.5f;
	}
	
	@override
	public String name() {
		return "Chicken Burger";
	}
}
