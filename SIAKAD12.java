import java.util.Scanner;

public class SIAKAD12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mk = { "Dasar Pemrograman", "Bahasa Inggris Dasar", "Praktikum Dasar Pemrograman", "Matematika Dasar",
                "Pengantar Akutansi, Manajemen, dan Bisnis", "Critical Thinking and Problem Solving",
                "Konsep Teknologi Informasi", "Agama", "Bahasa Indonesia"
        };

        double[] nilaimk = new double[mk.length];
        double[] nilaiSetara = new double[mk.length];
        int[] sksmk = { 2, 2, 3, 2, 2, 2, 2, 2, 2 };

        System.out.println();
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        System.out.println();
        double total = 0;
        int totalsks = 0;

        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan Nilai Angka Untuk MK " + mk[i] + ": ");
            nilaimk[i] = sc.nextDouble();

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

            total += nilaiSetara[i] * sksmk[i];
            totalsks += sksmk[i];
        }

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
