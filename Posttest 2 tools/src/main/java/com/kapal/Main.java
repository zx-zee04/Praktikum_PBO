package com.kapal;

import java.util.Scanner;
import com.kapal.model.Kapal;
import com.kapal.model.Nahkoda;
import com.kapal.model.Penyewa;
import com.kapal.service.SistemPenyewaanKapal;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int pilihan;
            do {
                System.out.println("\n===== SISTEM PENYEWAAN KAPAL =====");
                System.out.println("1. Tambah Kapal");
                System.out.println("2. Lihat Kapal");
                System.out.println("3. Tambah Penyewa");
                System.out.println("4. Lihat Penyewa");
                System.out.println("5. Tambah Nahkoda");
                System.out.println("6. Lihat Nahkoda");
                System.out.println("7. Sewa Kapal");
                System.out.println("8. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1 -> SistemPenyewaanKapal.tambahKapal();
                    case 2 -> Kapal.lihatKapal(SistemPenyewaanKapal.daftarKapal);
                    case 3 -> SistemPenyewaanKapal.tambahPenyewa();
                    case 4 -> Penyewa.lihatPenyewa(SistemPenyewaanKapal.daftarPenyewa);
                    case 5 -> SistemPenyewaanKapal.tambahNahkoda();
                    case 6 -> Nahkoda.lihatNahkoda(SistemPenyewaanKapal.daftarNahkoda);
                    case 7 -> SistemPenyewaanKapal.sewaKapal();
                    case 8 -> System.out.println("Terima kasih telah menggunakan sistem penyewaan kapal.");
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } while (pilihan != 8);
        }
    }
}
