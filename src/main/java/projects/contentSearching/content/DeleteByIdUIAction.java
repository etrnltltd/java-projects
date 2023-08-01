package projects.contentSearching.content;

import projects.contentSearching.book.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book's id: ");
        Long id = scanner.nextLong();
        if(bookDatabase.delete(id)) {
            System.out.println("Book deleted");
        } else {
            System.out.println("Book not found");
        }

    }
}
