package projects.contentSearching.content;

import projects.contentSearching.book.BookDatabase;

public class CountAllBooksUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Library contains " + bookDatabase.countAllBooks() + " books");
    }
}
