package visitor_pattern;

public abstract class ElementNode {

    public abstract void accept(Visitor visitor);
}
