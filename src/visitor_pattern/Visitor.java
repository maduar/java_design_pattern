package visitor_pattern;

public interface Visitor {

    void visit(ConcreteElementNodeA nodeA);

    void visit(ConcreteElementNodeB nodeB);
}
