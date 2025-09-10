package library;

/**
 * Class BookNode - Implementasi node untuk Linked List
 * Mendemonstrasikan konsep Node dan Pointer dalam struktur data
 */
public class BookNode {
    private Book book;          // Data buku
    private BookNode next;      // Pointer ke node berikutnya

    public BookNode(Book book) {
        this.book = book;
        this.next = null;
    }

    // Getter dan Setter methods
    public Book getBook() {
        return book;
    }

    public BookNode getNext() {
        return next;
    }

    public void setNext(BookNode next) {
        this.next = next;
    }
}
