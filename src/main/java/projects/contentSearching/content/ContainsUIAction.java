package projects.contentSearching.content;

import projects.contentSearching.book.Book;
import projects.contentSearching.book.BookDatabase;

import java.util.Scanner;

public class ContainsUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book's author: ");
        String author = scanner.nextLine();
        System.out.println("Book's title: ");
        String title = scanner.nextLine();
        scanner.close();
        Book bookToCheck = new Book(author, title);
        if (bookDatabase.contains(bookToCheck)) {
            System.out.println("Library has this book");
        } else {
            System.out.println("No book found");
        }
    }
}
