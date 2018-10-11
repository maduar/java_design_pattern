package visitor_pattern;

public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreteElementNodeA());
        objectStructure.add(new ConcreteElementNodeB());

        Visitor visitor = new ConcreteVisitorNodeA();
        objectStructure.action(visitor);
    }
}
