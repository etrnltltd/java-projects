package projects.contentSearching.search;

import projects.contentSearching.book.Book;


public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean test(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }
}
