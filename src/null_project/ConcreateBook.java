package null_project;

public class ConcreateBook implements Book{

    private int ID;
    private String name;
    private String author;

    @Override
    public boolean isNull() {
        return false;
    }

    public ConcreateBook(int ID, String name, String author) {
        this.ID = ID;
        this.name = name;
        this.author = author;
    }

    public void show() {
        System.out.println(ID + "**" + name + "**" + author);
    }
}
