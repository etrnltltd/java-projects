package projects.contentSearching.content;

import projects.contentSearching.book.BookDatabase;

import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Author to delete: ");
        String author = sc.nextLine();
        sc.close();
        bookDatabase.deleteByAuthor(author);
    }
}
