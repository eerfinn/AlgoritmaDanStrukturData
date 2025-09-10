package library;

/**
 * Class Book - Representasi dasar dari sebuah buku dalam sistem perpustakaan
 * Mendemonstrasikan penggunaan class sebagai struktur data dasar
 */
public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Getter dan Setter methods
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Method untuk menampilkan informasi buku
    @Override
    public String toString() {
        return String.format("ISBN: %s | Title: %s | Author: %s | Available: %s",
                isbn, title, author, isAvailable ? "Yes" : "No");
    }
}
