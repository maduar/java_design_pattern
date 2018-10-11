package visitor_pattern;

public class ConcreteVisitorNodeB implements Visitor {

    @Override
    public void visit(ConcreteElementNodeA nodeA) {
        System.out.println(nodeA.opreationA());
    }

    @Override
    public void visit(ConcreteElementNodeB nodeB) {
        System.out.println(nodeB.opreationB());
    }
}
