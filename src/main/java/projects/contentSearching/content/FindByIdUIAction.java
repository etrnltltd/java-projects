package projects.contentSearching.content;

import projects.contentSearching.book.Book;
import projects.contentSearching.book.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book's ID: ");
        Long booksId = scanner.nextLong();
        Optional<Book> bookOptional = bookDatabase.findById(booksId);
        System.out.println(bookOptional);
    }

}
