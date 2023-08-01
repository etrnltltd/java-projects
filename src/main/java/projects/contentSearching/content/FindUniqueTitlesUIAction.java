package projects.contentSearching.content;

import projects.contentSearching.book.BookDatabase;

public class FindUniqueTitlesUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(bookDatabase.findUniqueTitles());
    }
}
