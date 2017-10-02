package builder;

public abstract class Burger implements Item{

	@override
	public Packing packing() {
		return new Wrapper();
	}
	
	@override
	public abstract float price();
}
