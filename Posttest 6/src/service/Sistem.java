package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.Kapal;
import model.KapalCepat;
import model.Penyewa;

public class Sistem {
    public static ArrayList<Kapal> daftarKapal = new ArrayList<>();
    public static ArrayList<Penyewa> daftarPenyewa = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);
    private static int penyewaCounter = 1;

    public static void tambahKapal() {
        System.out.print("Masukkan Nama Kapal: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Stok Kapal: ");
        int stok = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Kecepatan Kapal (Knot): ");
        int kecepatan = input.nextInt();
        input.nextLine();

        Kapal kapalBaru = new KapalCepat(nama, stok, kecepatan);
        daftarKapal.add(kapalBaru);
        System.out.println("Kapal berhasil ditambahkan dengan ID: " + kapalBaru.getIdKapal());
    }

    public static void hapusKapal() {
        Kapal.lihatKapal(daftarKapal);
        System.out.print("Masukkan ID Kapal yang ingin dihapus: ");
        String id = input.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < daftarKapal.size(); i++) {
            if (daftarKapal.get(i).getIdKapal().equals(id)) {
                daftarKapal.remove(i);
                System.out.println("Kapal dengan ID " + id + " berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kapal dengan ID tersebut tidak ditemukan.");
        }
    }

    public static void hapusPenyewa() {
        Penyewa.lihatPenyewa(daftarPenyewa);
        System.out.print("Masukkan ID Penyewa yang ingin dihapus: ");
        String id = input.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < daftarPenyewa.size(); i++) {
            if (daftarPenyewa.get(i).getIdPenyewa().equals(id)) {
                daftarPenyewa.remove(i);
                System.out.println("Penyewa dengan ID " + id + " berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Penyewa dengan ID tersebut tidak ditemukan.");
        }
    }

    public static void tambahPenyewa() {
        String id = String.format("P%03d", penyewaCounter++);
        System.out.print("Masukkan Nama Penyewa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan No. Telepon: ");
        String noTelp = input.nextLine();

        if (daftarKapal.isEmpty()) {
            System.out.println("Tidak ada kapal tersedia untuk disewa.");
            return;
        }

        System.out.println("\nPilih Kapal yang Ingin Disewa:");
        for (int i = 0; i < daftarKapal.size(); i++) {
            Kapal k = daftarKapal.get(i);
            System.out.println((i + 1) + ". " + k.getNama() + " (ID: " + k.getIdKapal() + ", Stok: " + k.getStok() + ")");
        }

        System.out.print("Masukkan nomor kapal: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan < 1 || pilihan > daftarKapal.size()) {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        Kapal kapalDipilih = daftarKapal.get(pilihan - 1);
        if (kapalDipilih.getStok() <= 0) {
            System.out.println("Kapal tidak tersedia!");
            return;
        }

        Penyewa penyewaBaru = new Penyewa(id, nama, noTelp);
        penyewaBaru.setIdKapal(kapalDipilih.getIdKapal());
        daftarPenyewa.add(penyewaBaru);

        kapalDipilih.setStok(kapalDipilih.getStok() - 1);
        System.out.println("Penyewa berhasil ditambahkan dan kapal disewa!");
    }

}