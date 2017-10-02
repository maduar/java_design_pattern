package factory;

public class AbstractFactoryBMW523 implements AbstractFactory{

	@Override
	public Engine createEngine() {
		return new EngineB();
	}
	
	@Override
	public Aircondition createAircondition() {
		return new AirconditionB();
	}
}
