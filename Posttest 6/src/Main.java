import java.util.Scanner;
import model.Kapal;
import model.KapalCepat;
import model.Nahkoda;
import model.Penyewa;
import service.Sistem;

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
                System.out.println("9. Tes Polymorphism (infoKapal & overloading)");
                System.out.println("10. Tes Final Method (cetakIdentitas)");
                System.out.print("Pilih menu: ");
                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1 -> Sistem.tambahKapal();
                    case 2 -> Kapal.lihatKapal(Sistem.daftarKapal);
                    case 3 -> Sistem.tambahPenyewa();
                    case 4 -> Penyewa.lihatPenyewa(Sistem.daftarPenyewa);
                    case 5 -> Sistem.tambahNahkoda();
                    case 6 -> Nahkoda.lihatNahkoda(Sistem.daftarNahkoda);
                    case 7 -> Sistem.sewaKapal();
                    case 8 -> System.out.println("Terima kasih telah menggunakan sistem penyewaan kapal.");
                    case 9 -> {
                        // Polymorphism + Overriding + Overloading
                        Kapal kapal = new KapalCepat("KC002", "Super Jet", 2, 55);
                        kapal.infoKapal(); // Abstract method yang dioverride

                        if (kapal instanceof KapalCepat kc) {
                            kc.tampilkanInfo();           // Overloading tanpa parameter
                            kc.tampilkanInfo(true);       // Overloading dengan parameter
                        }
                    }
                    case 10 -> {
                        // Tes final method
                        if (Sistem.daftarPenyewa.isEmpty()) {
                            Penyewa penyewa = new Penyewa("P001", "Dina", "08123456789");
                            Sistem.daftarPenyewa.add(penyewa);
                        }
                        for (Penyewa p : Sistem.daftarPenyewa) {
                            p.cetakIdentitas(); // Final method
                        }
                    }
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } while (pilihan != 8);
        }
    }
}
