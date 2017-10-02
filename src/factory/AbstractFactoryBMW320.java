package factory;

public class AbstractFactoryBMW320 implements AbstractFactory{

	@Override
	public Engine createEngine() {
		return new EngineA();
	}
	
	@Override
	public Aircondition createAircondition() {
		return new AirconditionA();
	}
	
}
