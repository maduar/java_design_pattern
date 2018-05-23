package null_project;

public class BookFactory {

    public Book getBook(int ID) {
        Book book;
        switch (ID) {
            case 1:
                book = new ConcreateBook(ID, "设计模式", "Gof");
                break;
            case 2:
                book = new ConcreateBook(ID, "被遗忘的设计模式", "Null project pattern");
                break;
            default:
                book = new NullBook();
                break;
        }

        return book;
    }

}
