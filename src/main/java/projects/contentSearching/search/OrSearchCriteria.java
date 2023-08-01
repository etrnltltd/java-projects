package projects.contentSearching.search;

import projects.contentSearching.book.Book;


public class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean test(Book book) {
        return leftCondition.test(book) || rightCondition.test(book);
    }

}
