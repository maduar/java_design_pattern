package template_pattern;

public class Client {

    public static void main(String[] args) {
        ConcreteClass_BaoCai baocai = new ConcreteClass_BaoCai();
        baocai.cookProcess();

        System.out.println();
        System.out.println();

        ConcreteClass_CaiXin caixin = new ConcreteClass_CaiXin();
        caixin.cookProcess();

    }
}
