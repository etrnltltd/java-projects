package projects.contentSearching.content;

import projects.contentSearching.book.Book;
import projects.contentSearching.book.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book title: ");
        String title = scanner.nextLine();
        System.out.println("Book author: ");
        String author = scanner.nextLine();
        System.out.println("Year of issue: ");
        String year = scanner.nextLine();
        Book book = new Book(title, author, year);
        bookDatabase.save(book);
    }

}
