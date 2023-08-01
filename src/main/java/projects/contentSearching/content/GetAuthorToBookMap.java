package projects.contentSearching.content;

import projects.contentSearching.book.BookDatabase;

public class GetAuthorToBookMap implements UIAction{
    private BookDatabase bookDatabase;

    public GetAuthorToBookMap(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(bookDatabase.getAuthorToBooksMap());
    }
}
