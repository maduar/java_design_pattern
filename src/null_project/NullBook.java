package null_project;

public class NullBook implements Book {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public void show() {
        System.out.println("Sorry，未找到符合您输入的ID的图书信息，请确认您输入的不是非法值。");
    }
}
