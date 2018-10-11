package null_project;

public class Client {

    public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory();
        Book book = bookFactory.getBook(3);

        book.show();
//        if (book.isNull()) {
//            System.out.println("book is null");
//        } else {
//            book.show();
//        }
    }

}
