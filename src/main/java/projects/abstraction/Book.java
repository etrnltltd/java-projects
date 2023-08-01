package projects.abstraction;

class Book {
    private String author;
    private int releaseYear;
    private String bookTitle;
    private boolean isTaken;
    private boolean isReserved;
    private String dateOfReturn;
    private Reader nameOfOwner; //человек, у которога на руках книга

    public Book(String author, int releaseYear, String bookTitle) {
        this.author = author;
        this.releaseYear = releaseYear;
        this.bookTitle = bookTitle;
    }
}
