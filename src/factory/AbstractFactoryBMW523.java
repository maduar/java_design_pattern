package factory;

public class AbstractFactoryBMW523 implements AbstractFactory{

	@override
	public Engine createEngine() {
		return new EngineB();
	}
	
	@override
	public Aircondition createAircondition() {
		return new AirconditionB();
	}
}
