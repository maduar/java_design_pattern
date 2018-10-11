package template_pattern;

public abstract class AbstractClass {

    final void cookProcess() {
        this.pourOil();
        this.heatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }

    void pourOil() {
        System.out.println("pour oil");
    }

    void heatOil() {
        System.out.println("heat oil");
    }

    abstract void pourVegetable();
    abstract void pourSauce();

    void fry() {
        System.out.println("fry fry !!");
    }
}
