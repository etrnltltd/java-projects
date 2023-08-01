package projects.interfaces.bookReader;

import java.util.List;

interface BookReader {

    boolean addBook(Book book);
    boolean hasTitleAndAuthor(Book book);
    boolean deleteBook(Book book);
    String[] getListOfAllBooks();
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);
    boolean markAsRead(Book book);
    boolean markAsUnread(Book book);
    List<String> getListOfAllReadBooks();
    List<String> getListOfAllUnreadBooks();
}
