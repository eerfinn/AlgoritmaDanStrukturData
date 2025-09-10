package library;

/**
 * Class BookLinkedList - Implementasi Linked List untuk menyimpan koleksi buku
 * Mendemonstrasikan:
 * 1. Struktur Data Linked List
 * 2. Operasi dasar Linked List (insert, delete, traverse)
 * 3. Algoritma pencarian linear
 */
public class BookLinkedList {
    private BookNode head;      // Pointer ke node pertama
    private int size;           // Jumlah buku dalam list

    public BookLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Menambahkan buku baru ke awal list (operasi insert)
     * Kompleksitas Waktu: O(1)
     */
    public void addBook(Book book) {
        BookNode newNode = new BookNode(book);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    /**
     * Mencari buku berdasarkan ISBN menggunakan Linear Search
     * Kompleksitas Waktu: O(n)
     */
    public Book findBook(String isbn) {
        BookNode current = head;
        while (current != null) {
            if (current.getBook().getIsbn().equals(isbn)) {
                return current.getBook();
            }
            current = current.getNext();
        }
        return null;
    }

    /**
     * Menghapus buku berdasarkan ISBN
     * Kompleksitas Waktu: O(n)
     */
    public boolean removeBook(String isbn) {
        if (head == null) return false;

        // Kasus khusus: jika buku yang akan dihapus ada di head
        if (head.getBook().getIsbn().equals(isbn)) {
            head = head.getNext();
            size--;
            return true;
        }

        // Mencari buku yang akan dihapus
        BookNode current = head;
        BookNode prev = null;
        while (current != null && !current.getBook().getIsbn().equals(isbn)) {
            prev = current;
            current = current.getNext();
        }

        // Jika buku ditemukan
        if (current != null) {
            prev.setNext(current.getNext());
            size--;
            return true;
        }

        return false;
    }

    /**
     * Menampilkan semua buku dalam list
     * Kompleksitas Waktu: O(n)
     */
    public void displayBooks() {
        if (head == null) {
            System.out.println("Perpustakaan kosong!");
            return;
        }

        System.out.println("\nDaftar Buku dalam Perpustakaan:");
        System.out.println("================================");
        BookNode current = head;
        while (current != null) {
            System.out.println(current.getBook().toString());
            current = current.getNext();
        }
        System.out.println("Total buku: " + size);
    }

    /**
     * Mendapatkan jumlah buku dalam list
     * Kompleksitas Waktu: O(1)
     */
    public int getSize() {
        return size;
    }
}
