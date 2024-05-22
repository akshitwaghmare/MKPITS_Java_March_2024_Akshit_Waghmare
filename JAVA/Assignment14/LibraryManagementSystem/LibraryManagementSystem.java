package LibraryManagementSystem;

import StudentManagementSysytem.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class LibraryManagementSystem {
    public ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(String ISBN,String title, String author, int yearPublished){
        books.add(new Book(ISBN,title,author,yearPublished));
    }
    public void removeBookByIsbn(String ISBN){
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getISBN().equals(ISBN)) {
                iterator.remove();
            }
        }
    }
    public Book SearchBookByIsbn(String ISBN){
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();
        System.out.println("To add book");
        libraryManagementSystem.addBook("01","book1","Akshit",2001);
        libraryManagementSystem.addBook("02","book2","adarsh",2002);
        System.out.println("Remove a book by ISBN");
        libraryManagementSystem.removeBookByIsbn("02");
        System.out.println("Search for a book by ISBN");
        libraryManagementSystem.SearchBookByIsbn("02");
        System.out.println("Display All books");
        libraryManagementSystem.displayBooks();
    }
}
