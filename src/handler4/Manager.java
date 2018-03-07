package handler4;

public class Manager extends AbstractClerk{

    public Manager() {
        super.type = "经理";
    }

    @Override
    public int getLimit() {
        return 100000;
    }
}
