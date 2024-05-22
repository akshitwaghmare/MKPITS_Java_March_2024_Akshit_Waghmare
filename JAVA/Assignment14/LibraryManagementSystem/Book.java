package LibraryManagementSystem;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private int yearPublished;

    public Book(String ISBN, String title, String author, int yearPublished) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }
}
