package factory;

public class FactoryBMW320 implements FactoryBMW{
	@override
	public BMW320 createBMW() {
		return new BMW320();
	}
}
