package factory_method3;

import factory_method2.FactoryBMW;

public class Customer {
    public static void main(String[] args) {
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW523.createAircondition();
        factoryBMW523.createEngine();

        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();
    }
}
