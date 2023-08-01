package projects.contentSearching.content;

import projects.contentSearching.book.Book;
import projects.contentSearching.book.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Author's name: ");
        String authorName = scanner.nextLine();
        List<Book> books = bookDatabase.findByAuthor(authorName);
        System.out.println(books);
    }
}
