package visitor_pattern;

public class ConcreteElementNodeA extends ElementNode {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String opreationA() {
        return "ConcreteElementNodeA";
    }

}
