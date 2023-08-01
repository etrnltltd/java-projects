package projects.contentSearching.content;

import projects.contentSearching.book.Book;
import projects.contentSearching.book.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book's title: ");
        String title = scanner.nextLine();
        scanner.close();
        List<Book> books = bookDatabase.findByTitle(title);
        System.out.println(books);
    }
}