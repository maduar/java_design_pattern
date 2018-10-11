package visitor_pattern;

public class ConcreteVisitorNodeA implements Visitor {

    @Override
    public void visit(ConcreteElementNodeA node) {
        System.out.println(node.opreationA());
    }

    @Override
    public void visit(ConcreteElementNodeB nodeB) {
        System.out.println(nodeB.opreationB());
    }
}
