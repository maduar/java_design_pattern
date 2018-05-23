package template_pattern;

public class ConcreteClass_BaoCai extends AbstractClass {

    @Override
    void pourVegetable() {
        System.out.println("baocai....");
    }

    @Override
    void pourSauce() {
        System.out.println("pepper !");
    }
}
