import java.util.Scanner;

/**
 * Program Kalkulator Fisika - Kecepatan, Jarak, dan Waktu
 * Program ini mengimplementasikan rumus-rumus dasar fisika untuk menghitung:
 * 1. Kecepatan (v = s/t)
 * 2. Jarak (s = v*t)
 * 3. Waktu (t = s/v)
 * 
 * Dimana:
 * v = kecepatan (velocity)
 * s = jarak (distance)
 * t = waktu (time)
 */
public class PhysicsCalculator {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input pengguna
        Scanner sc = new Scanner(System.in);
        // Variabel untuk menyimpan pilihan menu
        char pilihan = ' ';
        // Deklarasi variabel untuk perhitungan
        double s, t, v; // s=jarak, t=waktu, v=kecepatan

        // Loop menu utama - akan berjalan sampai user memilih untuk keluar (pilihan 4)
        while (pilihan != '4') {
            // Menampilkan menu pilihan
            System.out.println();
            System.out.println("=================");
            System.out.println("      MENU");
            System.out.println("=================");
            System.out.println("1. Menghitung hasil perhitungan Kecepatan (v = s/t)");
            System.out.println("2. Menghitung hasil perhitungan Jarak (s = v*t)");
            System.out.println("3. Menghitung hasil perhitungan Waktu (t = s/v)");
            System.out.println("4. Keluar");
            System.out.println();
            
            // Membaca input pilihan dari pengguna
            System.out.print("Masukan Input: ");
            pilihan = sc.next().charAt(0);  // Mengambil karakter pertama dari input
            System.out.println("-----------------");

            // Memproses pilihan pengguna menggunakan switch-case
            switch (pilihan) {
                case '1':
                    // Menghitung Kecepatan (v = s/t)
                    System.out.print("Input jarak (s) : ");
                    s = sc.nextDouble();
                    System.out.print("Input waktu (t) : ");
                    t = sc.nextDouble();
                    v = s / t;  // Rumus kecepatan
                    System.out.println("Kecepatan (v) = " + v);
                    break;
                case '2':
                    // Menghitung Jarak (s = v*t)
                    System.out.print("Input kecepatan (v) : ");
                    v = sc.nextDouble();
                    System.out.print("Input waktu (t) : ");
                    t = sc.nextDouble();
                    s = v * t;  // Rumus jarak
                    System.out.println("Jarak (s) = " + s);
                    break;
                case '3':
                    // Menghitung Waktu (t = s/v)
                    System.out.print("Input jarak (s) : ");
                    s = sc.nextDouble();
                    System.out.print("Input kecepatan (v) : ");
                    v = sc.nextDouble();
                    t = s / v;  // Rumus waktu
                    System.out.println("Waktu (t) = " + t);
                    break;
                case '4':
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak sesuai");
            }
        }
        sc.close();
    }
}
