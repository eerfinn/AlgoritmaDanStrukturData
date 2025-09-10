# Praktikum Algoritma dan Struktur Data

Repository ini berisi implementasi berbagai konsep Algoritma dan Struktur Data dalam bahasa Java. Setiap program dirancang untuk mendemonstrasikan konsep-konsep penting dan penggunaannya dalam aplikasi praktis.

## 📚 Daftar Program

### 1. Program Pencarian Plat Nomor (`LicensePlateSearch.java`)
Program ini mendemonstrasikan:
- **Algoritma Pencarian Linear (Sequential Search)**
- **Array sebagai struktur data**
- **String manipulation**

Fitur:
- Pencarian kota berdasarkan kode plat nomor
- Penggunaan array paralel untuk menyimpan data
- Case-insensitive search

### 2. Kalkulator Fisika (`PhysicsCalculator.java`)
Program ini mendemonstrasikan:
- **Penggunaan switch-case untuk menu**
- **Perhitungan rumus fisika dasar**
- **Input/Output handling**

Rumus yang diimplementasikan:
- Kecepatan (v = s/t)
- Jarak (s = v*t)
- Waktu (t = s/v)

### 3. Kalkulator IP Semester (`SemesterGPACalculator.java`)
Program ini mendemonstrasikan:
- **Array multidimensi**
- **Konversi nilai**
- **Perhitungan berbobot (weighted calculation)**

Fitur:
- Input nilai untuk multiple mata kuliah
- Konversi nilai angka ke huruf
- Perhitungan IP berdasarkan SKS
- Format output tabel

### 4. Sistem Manajemen Perpustakaan (`library/`)
Implementasi kompleks yang mendemonstrasikan:
- **Linked List**
- **Object-Oriented Programming**
- **CRUD Operations**

Struktur Program:
```
library/
├── Book.java          # Class dasar untuk data buku
├── BookNode.java      # Node untuk Linked List
├── BookLinkedList.java # Implementasi Linked List
└── LibraryApp.java    # Program utama
```

## 🎯 Konsep yang Dipelajari

### 1. Struktur Data
- **Array**
  - Array satu dimensi
  - Array paralel
  - Manipulasi array
- **Linked List**
  - Node dan Pointer
  - Operasi dasar (insert, delete, traverse)
  - Manajemen memori dinamis

### 2. Algoritma
- **Searching**
  - Linear Search (Sequential Search)
- **Sorting** (dalam pengembangan)
- **Perhitungan**
  - Weighted average (IP Semester)
  - Formula fisika

### 3. Teknik Pemrograman
- **Object-Oriented Programming**
  - Class dan Objects
  - Encapsulation
  - Methods dan Properties
- **Control Structures**
  - Loops (for, while)
  - Conditional statements (if-else, switch)
- **Input/Output**
  - Scanner class
  - Formatted output

## 💡 Tips Pembelajaran

1. **Mulai dari Yang Sederhana**
   - Pelajari `LicensePlateSearch.java` untuk memahami array dan pencarian
   - Lanjut ke `PhysicsCalculator.java` untuk konsep menu dan perhitungan
   - Pelajari `SemesterGPACalculator.java` untuk array yang lebih kompleks

2. **Pelajari Linked List**
   - Mulai dengan memahami `Book.java` dan struktur datanya
   - Pelajari `BookNode.java` untuk konsep node dan pointer
   - Pahami `BookLinkedList.java` untuk implementasi operasi linked list
   - Terakhir, lihat `LibraryApp.java` untuk penggunaan dalam aplikasi

3. **Latihan Praktik**
   - Modifikasi program yang ada
   - Tambahkan fitur baru
   - Implementasikan algoritma sorting
   - Buat variasi struktur data

## 🔄 Kompleksitas Waktu

### LicensePlateSearch
- Pencarian: O(n)

### PhysicsCalculator
- Perhitungan: O(1)

### SemesterGPACalculator
- Input dan Konversi: O(n)
- Perhitungan IP: O(n)

### Library System
- Tambah Buku (Add): O(1)
- Cari Buku (Search): O(n)
- Hapus Buku (Delete): O(n)
- Tampilkan Semua (Display): O(n)

## 🚀 Pengembangan Selanjutnya

1. Implementasi struktur data baru:
   - Stack
   - Queue
   - Binary Tree
   - Hash Table

2. Tambahan algoritma:
   - Binary Search
   - Bubble Sort
   - Quick Sort
   - Merge Sort

3. Fitur aplikasi:
   - Persistensi data ke file
   - Interface grafis (GUI)
   - Database integration
   - RESTful API

## 📝 Cara Menjalankan Program

1. Pastikan Java Development Kit (JDK) terinstall
2. Compile program dengan command:
   ```bash
   javac NamaProgram.java
   ```
3. Jalankan program dengan:
   ```bash
   java NamaProgram
   ```

Untuk Library System:
```bash
javac library/*.java
java library.LibraryApp
```

## 📚 Referensi

- [Java Documentation](https://docs.oracle.com/en/java/)
- [Data Structures and Algorithms in Java](https://www.geeksforgeeks.org/data-structures/)
- [Big O Notation](https://www.bigocheatsheet.com/)
