import java.util.Scanner;

/**
 * Program Perhitungan IP Semester (GPA Calculator)
 * Program ini menghitung Indeks Prestasi (IP) semester berdasarkan:
 * 1. Nilai angka per mata kuliah (0-100)
 * 2. Konversi ke nilai huruf (A, B+, B, C+, C, D, E)
 * 3. Konversi ke bobot nilai (4.0, 3.5, 3.0, 2.5, 2.0, 1.0, 0)
 * 4. Perhitungan IP dengan mempertimbangkan bobot SKS
 */
public class SemesterGPACalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Daftar mata kuliah yang diambil pada semester
        String[] mk = { 
            "Dasar Pemrograman", 
            "Bahasa Inggris Dasar", 
            "Praktikum Dasar Pemrograman", 
            "Matematika Dasar",
            "Pengantar Akutansi, Manajemen, dan Bisnis", 
            "Critical Thinking and Problem Solving",
            "Konsep Teknologi Informasi", 
            "Agama", 
            "Bahasa Indonesia"
        };

        // Array untuk menyimpan nilai angka (0-100) untuk setiap mata kuliah
        double[] nilaimk = new double[mk.length];
        // Array untuk menyimpan bobot nilai (0-4.0) untuk setiap mata kuliah
        double[] nilaiSetara = new double[mk.length];
        // Array berisi SKS (satuan kredit semester) untuk setiap mata kuliah
        int[] sksmk = { 2, 2, 3, 2, 2, 2, 2, 2, 2 };

        // Header program
        System.out.println();
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        System.out.println();
        double total = 0;
        int totalsks = 0;

        // Input nilai dan konversi untuk setiap mata kuliah
        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan Nilai Angka Untuk MK " + mk[i] + ": ");
            nilaimk[i] = sc.nextDouble();

            // Konversi nilai angka ke bobot nilai
            // Sistem penilaian:
            // 0-39   -> E  -> 0.0
            // 40-50  -> D  -> 1.0
            // 51-60  -> C  -> 2.0
            // 61-65  -> C+ -> 2.5
            // 66-73  -> B  -> 3.0
            // 74-80  -> B+ -> 3.5
            // 81-100 -> A  -> 4.0
            if (nilaimk[i] <= 39) {
                nilaiSetara[i] = 0;
            } else if (nilaimk[i] > 39 && nilaimk[i] <= 50) {
                nilaiSetara[i] = 1.0;
            } else if (nilaimk[i] > 50 && nilaimk[i] <= 60) {
                nilaiSetara[i] = 2.0;
            } else if (nilaimk[i] > 60 && nilaimk[i] <= 65) {
                nilaiSetara[i] = 2.5;
            } else if (nilaimk[i] > 65 && nilaimk[i] <= 73) {
                nilaiSetara[i] = 3.0;
            } else if (nilaimk[i] > 73 && nilaimk[i] <= 80) {
                nilaiSetara[i] = 3.5;
            } else if (nilaimk[i] > 80 && nilaimk[i] <= 100) {
                nilaiSetara[i] = 4.0;
            }

            // Menghitung total nilai (bobot * sks) dan total sks
            total += nilaiSetara[i] * sksmk[i];
            totalsks += sksmk[i];
        }

        // Menampilkan hasil konversi nilai
        System.out.println();
        System.out.println("=====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================");
        System.out.println();
        System.out
                .println("Mata Kuliah                                          Nilai Angka  Nilai Huruf  Bobot Nilai");
        System.out.println();
        for (int i = 0; i < mk.length; i++) {
            String nilaiHuruf = "";
            if (nilaimk[i] <= 39) {
                nilaiHuruf = "E";
            } else if (nilaimk[i] > 39 && nilaimk[i] <= 50) {
                nilaiHuruf = "D";
            } else if (nilaimk[i] > 50 && nilaimk[i] <= 60) {
                nilaiHuruf = "C";
            } else if (nilaimk[i] > 60 && nilaimk[i] <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaimk[i] > 65 && nilaimk[i] <= 73) {
                nilaiHuruf = "B";
            } else if (nilaimk[i] > 73 && nilaimk[i] <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaimk[i] > 80 && nilaimk[i] <= 100) {
                nilaiHuruf = "A";
            }
            System.out.printf("%-55s %-13.2f %-11s %-10.1f\n", mk[i], nilaimk[i], nilaiHuruf, nilaiSetara[i]);
        }
        sc.close();
        System.out.println("=====================");

        double ip = total / totalsks;
        System.out.print("IP : " + ip);

    }
}
