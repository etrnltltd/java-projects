package projects.contentSearching.search;

import projects.contentSearching.book.Book;

import java.util.function.Predicate;

public interface SearchCriteria extends Predicate<Book> {
    boolean test(Book book);
}
