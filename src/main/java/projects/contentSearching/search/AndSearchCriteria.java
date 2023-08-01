package projects.contentSearching.search;

import projects.contentSearching.book.Book;

public class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean test(Book book) {
        return leftCondition.test(book) && rightCondition.test(book);
    }

}
