package factory;

public class Customer {
	public static void main(String[] args) {
		System.out.println("简单工厂模式");
		Factory bmwFactory = new Factory();
		BMW bmw523 =  bmwFactory.createBMW(320);
		BMW bmw320 =  bmwFactory.createBMW(523);
		
		System.out.println("工厂方法模式");
		FactoryBMW320 factoryBMW320 = new FactoryBMW320();
		BMW320 bmw320New = factoryBMW320.createBMW();
		
		FactoryBMW523 factoryBMW523 = new FactoryBMW523();
		BMW523 bmw523New = factoryBMW523.createBMW();
		
		System.out.println("抽象工厂模式");
		AbstractFactoryBMW320 afBMW320 = new AbstractFactoryBMW320();
		afBMW320.createEngine();
		afBMW320.createAircondition();
		
		AbstractFactoryBMW523 afBMW523 = new AbstractFactoryBMW523();
		afBMW320.createEngine();
		afBMW320.createAircondition();
	}
}
