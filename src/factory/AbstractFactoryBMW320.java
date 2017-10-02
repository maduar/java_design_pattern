package factory;

public class AbstractFactoryBMW320 implements AbstractFactory{

	@override
	public Engine createEngine() {
		return new EngineA();
	}
	
	@override
	public Aircondition createAircondition() {
		return new AirconditionA();
	}
	
}
