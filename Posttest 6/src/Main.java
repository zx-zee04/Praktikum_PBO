import java.util.InputMismatchException;
import java.util.Scanner;
import model.Kapal;
import model.Penyewa;
import service.Sistem;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int pilihan = 0;
            do {
                System.out.println("\n===== SISTEM PENYEWAAN KAPAL =====");
                System.out.println("1. Tambah Kapal");
                System.out.println("2. Lihat Kapal");
                System.out.println("3. Hapus Kapal");
                System.out.println("4. Tambah Penyewa");
                System.out.println("5. Lihat Penyewa");
                System.out.println("6. Hapus Penyewa");
                System.out.println("7. Keluar");
                System.out.println("8. Tes Polymorphism (infoKapal & overloading)");
                System.out.println("9. Tes Final Method (cetakIdentitas)");
                System.out.print("Pilih menu: ");
            
                try {
                    pilihan = input.nextInt();
                    input.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka!");
                    input.nextLine();
                    continue;
                }
            
                switch (pilihan) {
                    case 1 -> Sistem.tambahKapal();
                    case 2 -> Kapal.lihatKapal(Sistem.daftarKapal);
                    case 3 -> Sistem.hapusKapal();
                    case 4 -> Sistem.tambahPenyewa();
                    case 5 -> Penyewa.lihatPenyewa(Sistem.daftarPenyewa);
                    case 6 -> Sistem.hapusPenyewa();
                    case 7 -> System.out.println("Terima kasih telah menggunakan sistem penyewaan kapal.");
                    case 8 -> Kapal.Tespolymorphism(Sistem.daftarKapal);
                    case 9 -> {
                        if (Sistem.daftarPenyewa.isEmpty()) {
                            System.out.println("Daftar penyewa kosong. Menambahkan penyewa default...");
                            Penyewa penyewaDefault = new Penyewa("P001", "Dina", "08123456789");
                            Sistem.daftarPenyewa.add(penyewaDefault);
                            for (Penyewa p : Sistem.daftarPenyewa) {
                                p.cetakIdentitas();
                            }
                        } else {
                            for (Penyewa p : Sistem.daftarPenyewa) {
                                p.cetakIdentitas();
                            }
                        }
                    }
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } while (pilihan != 7);
        }
    }
}
