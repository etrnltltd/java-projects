package projects.contentSearching.search;

import projects.contentSearching.book.Book;


public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }
    @Override
    public boolean test(Book book) {
        return book.getTitle().equals(titleToSearch);
    }
}
