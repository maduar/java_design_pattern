package handler4;

public class Boss extends AbstractClerk{

    public Boss() {
        super.type = "老板";
    }

    @Override
    public int getLimit() {
        return 10000000;
    }
}
