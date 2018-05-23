package visitor_pattern;

public class ConcreteElementNodeB extends ElementNode{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String opreationB() {
        return "ConcreteElementNodeB";
    }
}
