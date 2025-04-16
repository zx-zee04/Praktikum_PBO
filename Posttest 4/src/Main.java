import java.util.Scanner;
import model.Kapal;
import model.Nahkoda;
import model.Penyewa;
import service.SistemPenyewaanKapal;
import model.KapalCepat;

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
                System.out.println("9. Tes Polymorphism");
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
                    case 9 -> {
                        KapalCepat kc = new KapalCepat("KC001", "Express Bali", 3, 40);
                        kc.tampilkanInfo(); // overloading
                        kc.tampilkanInfo(true); // overloading
                        kc.setStok(5); // overriding
                    }
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } while (pilihan != 8);
        }
    }
}