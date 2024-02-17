import java.util.Scanner;

public class Rumus12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char pilihan = ' ';
        double s, t, v;

        while (pilihan != '4') {
            System.out.println();
            System.out.println("=================");
            System.out.println("      MENU");
            System.out.println("=================");
            System.out.println("1. Menghitung hasil perhitungan Kecepatan");
            System.out.println("2. Menghitung hasil perhitungan Jarak");
            System.out.println("3. Menghitung hasil perhitungan Waktu");
            System.out.println("4. Keluar");
            System.out.println();
            System.out.print("Masukan Input: ");
            pilihan = sc.next().charAt(0);
            System.out.println("-----------------");

            switch (pilihan) {
                case '1':
                    System.out.print("Input jarak : ");
                    s = sc.nextDouble();
                    System.out.print("Input waktu : ");
                    t = sc.nextDouble();
                    v = s / t;
                    System.out.println("Kecepatan = " + v);
                    break;
                case '2':
                    System.out.print("Input kecepatan : ");
                    v = sc.nextDouble();
                    System.out.print("Input waktu : ");
                    t = sc.nextDouble();
                    s = v * t;
                    System.out.println("Jarak = " + s);
                    break;
                case '3':
                    System.out.print("Input jarak : ");
                    s = sc.nextDouble();
                    System.out.print("Input kecepatan : ");
                    v = sc.nextDouble();
                    t = s / v;
                    System.out.println("Waktu = " + t);
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
