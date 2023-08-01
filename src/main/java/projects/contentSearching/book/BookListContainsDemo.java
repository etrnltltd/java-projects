package projects.contentSearching.book;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

    public static void main(String[] args) {
        List<BookList> books = new ArrayList();
        BookList book1 = new BookList("Tolkien", "LOTR");
        BookList book2 = new BookList("Rowling", "HP");
        books.add(book1);
        books.add(book2);
        System.out.println(books.contains(book1));
    }
}
