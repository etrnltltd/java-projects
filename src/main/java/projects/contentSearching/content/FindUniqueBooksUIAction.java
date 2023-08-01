package projects.contentSearching.content;

import projects.contentSearching.book.BookDatabase;

public class FindUniqueBooksUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(bookDatabase.findUniqueBooks());
    }
}
