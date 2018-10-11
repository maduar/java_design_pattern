package visitor_pattern;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<ElementNode> nodeList = new ArrayList<>();

    public void action(Visitor visitor) {
        for (ElementNode node : nodeList) {
            node.accept(visitor);
        }
    }

    public void add(ElementNode node) {
        nodeList.add(node);
    }
}
