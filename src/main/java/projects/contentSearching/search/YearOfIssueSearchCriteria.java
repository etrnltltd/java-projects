package projects.contentSearching.search;

import projects.contentSearching.book.Book;


public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean test(Book book) {
        return book.getYearOfIssue().equals(yearOfIssueToSearch);
    }

}
