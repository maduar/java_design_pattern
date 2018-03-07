package handler4;

public class Leader extends AbstractClerk{

    public Leader() {
        super.type = "组长";
    }

    @Override
    public int getLimit() {
        return 20000;
    }
}
