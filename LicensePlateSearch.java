import java.util.Scanner;

/**
 * Program Pencarian Kota Berdasarkan Kode Plat Nomor
 * Program ini memungkinkan pengguna untuk mencari kota asal berdasarkan kode plat nomor kendaraan.
 */
public class LicensePlateSearch {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari user
        Scanner sc = new Scanner(System.in);
        
        // Array untuk menyimpan kode plat nomor
        String[] Kode = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        
        // Array untuk menyimpan nama kota yang bersesuaian dengan kode plat nomor
        String[] Kota = {
            "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", 
            "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"
        };

        // Meminta input dari user
        System.out.print("Masukkan Kode Plat Nomor : ");
        // Mengambil input dan mengkonversi ke huruf kapital
        String inputKode = sc.nextLine().toUpperCase();

        // Inisialisasi variabel pencarian dengan nilai -1 (belum ditemukan)
        int search = -1;
        // Melakukan pencarian sequential untuk menemukan kode plat
        for(int i = 0; i < Kode.length; i++) {
            if(Kode[i].equals(inputKode)) {
                search = i;  // Menyimpan indeks ketika kode ditemukan
                break;      // Keluar dari loop karena sudah ditemukan
            }
        }
        
        // Menampilkan hasil pencarian
        if(search != -1) {
            System.out.println("Kode plat nomor " + inputKode + " berasal dari Kota " + Kota[search]);
        } else {
            System.out.println("Kode plat nomor tidak ditemukan");
        }
        // Menutup Scanner untuk mencegah memory leak
        sc.close();
    }
}
