package library;

import java.util.Scanner;

/**
 * Class LibraryApp - Program utama sistem manajemen perpustakaan sederhana
 * Program ini mendemonstrasikan:
 * 1. Penggunaan Linked List sebagai struktur data
 * 2. Implementasi operasi CRUD (Create, Read, Update, Delete)
 * 3. Linear Search untuk pencarian data
 * 4. Manajemen memori dinamis
 */
public class LibraryApp {
    private static BookLinkedList library = new BookLinkedList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (choice) {
                case 1:
                    addNewBook();
                    break;
                case 2:
                    findBookByIsbn();
                    break;
                case 3:
                    removeBookByIsbn();
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 5);
        
        scanner.close();
    }

    /**
     * Menampilkan menu utama aplikasi
     */
    private static void displayMenu() {
        System.out.println("\n=== Sistem Manajemen Perpustakaan ===");
        System.out.println("1. Tambah Buku Baru");
        System.out.println("2. Cari Buku (by ISBN)");
        System.out.println("3. Hapus Buku (by ISBN)");
        System.out.println("4. Tampilkan Semua Buku");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    /**
     * Menambahkan buku baru ke perpustakaan
     */
    private static void addNewBook() {
        System.out.println("\n=== Tambah Buku Baru ===");
        System.out.print("Masukkan ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Masukkan Judul: ");
        String title = scanner.nextLine();
        System.out.print("Masukkan Pengarang: ");
        String author = scanner.nextLine();

        Book newBook = new Book(isbn, title, author);
        library.addBook(newBook);
        System.out.println("Buku berhasil ditambahkan!");
    }

    /**
     * Mencari buku berdasarkan ISBN
     */
    private static void findBookByIsbn() {
        System.out.println("\n=== Cari Buku ===");
        System.out.print("Masukkan ISBN: ");
        String isbn = scanner.nextLine();

        Book book = library.findBook(isbn);
        if (book != null) {
            System.out.println("Buku ditemukan:");
            System.out.println(book.toString());
        } else {
            System.out.println("Buku dengan ISBN " + isbn + " tidak ditemukan.");
        }
    }

    /**
     * Menghapus buku berdasarkan ISBN
     */
    private static void removeBookByIsbn() {
        System.out.println("\n=== Hapus Buku ===");
        System.out.print("Masukkan ISBN: ");
        String isbn = scanner.nextLine();

        if (library.removeBook(isbn)) {
            System.out.println("Buku berhasil dihapus!");
        } else {
            System.out.println("Buku dengan ISBN " + isbn + " tidak ditemukan.");
        }
    }
}
