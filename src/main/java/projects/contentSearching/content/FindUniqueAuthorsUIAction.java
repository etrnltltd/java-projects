package projects.contentSearching.content;

import projects.contentSearching.book.BookDatabase;

public class FindUniqueAuthorsUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(bookDatabase.findUniqueAuthors());
    }
}
