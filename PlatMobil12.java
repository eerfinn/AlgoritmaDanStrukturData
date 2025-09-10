import java.util.Scanner;

public class PlatMobil12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] Kode = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        String[] Kota = {
            "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", 
            "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"
        };

        System.out.print("Masukkan Kode Plat Nomor : ");
        String inputKode = sc.nextLine().toUpperCase();

        int search = -1;
        for(int i = 0; i < Kode.length; i++) {
            if(Kode[i].equals(inputKode)) {
                search = i;
                break;
            }
        }
        
        if(search != -1) {
            System.out.println("Kode plat nomor " + inputKode + " berasal dari Kota " + Kota[search]);
        } else {
            System.out.println("Kode plat nomor tidak ditemukan");
        }
        sc.close();
    }
}
