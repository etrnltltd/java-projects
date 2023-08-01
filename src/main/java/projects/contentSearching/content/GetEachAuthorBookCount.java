package projects.contentSearching.content;

import projects.contentSearching.book.BookDatabase;

public class GetEachAuthorBookCount implements UIAction{
    private BookDatabase bookDatabase;

    public GetEachAuthorBookCount(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(bookDatabase.getEachAuthorBookCount());
    }
}
