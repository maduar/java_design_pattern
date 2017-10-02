package builder;

public abstract class ColdDrink implements Item{

	@override
	public Packing packing() {
		return new Bottle();
	}
	
	@override
	public abstract float price();
}
