## Skenario Program

### 1. Library System - Skenario Penggunaan

**Skenario 1: Menambah dan Mencari Buku**
```
1. Tambah Buku Pertama:
   Menu 1 → ISBN: 9780123456789 → Judul: Java Programming → Pengarang: John Doe
   
2. Tambah Buku Kedua:
   Menu 1 → ISBN: 9789876543210 → Judul: Data Structures → Pengarang: Jane Smith
   
3. Cari Buku:
   Menu 2 → ISBN: 9780123456789
   (Program akan menampilkan detail buku Java Programming)
```

**Skenario 2: Menghapus dan Memverifikasi**
```
1. Lihat Daftar Buku:
   Menu 4 (Menampilkan kedua buku)
   
2. Hapus Buku:
   Menu 3 → ISBN: 9789876543210
   
3. Verifikasi:
   Menu 4 (Sekarang hanya menampilkan satu buku)
```

### 2. Physics Calculator - Skenario Penggunaan

**Contoh Perhitungan Kecepatan:**
```
1. Pilih menu 1 (Kecepatan)
2. Masukkan jarak: 100 (meter)
3. Masukkan waktu: 20 (detik)
4. Program menghitung: v = s/t = 100/20 = 5 m/s
```

### 3. GPA Calculator - Skenario Penggunaan

**Contoh Perhitungan IP:**
```
1. Input nilai untuk setiap mata kuliah
   - Dasar Pemrograman: 85 (A)
   - Matematika Dasar: 78 (B+)
   
2. Program akan:
   - Mengkonversi nilai angka ke huruf
   - Menghitung bobot nilai
   - Memperhitungkan SKS
   - Menampilkan IP final
```

## Daftar Program

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
├── Book.java            # Class dasar untuk data buku
├── BookNode.java        # Node untuk Linked List
├── BookLinkedList.java  # Implementasi Linked List
└── LibraryApp.java      # Program utama
```

## Konsep yang Dipelajari

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

## Cara Menjalankan Program

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

## Referensi

- [Java Documentation](https://docs.oracle.com/en/java/)
- [Data Structures and Algorithms in Java](https://www.geeksforgeeks.org/data-structures/)
- [Big O Notation](https://www.bigocheatsheet.com/)
