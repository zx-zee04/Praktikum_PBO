package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.Kapal;
import model.KapalCepat;
import model.Nahkoda;
import model.Penyewa;

public class Sistem {
    public static ArrayList<Kapal> daftarKapal = new ArrayList<>();
    public static ArrayList<Penyewa> daftarPenyewa = new ArrayList<>();
    public static ArrayList<Nahkoda> daftarNahkoda = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);

    public static void tambahKapal() {
        System.out.print("Masukkan ID Kapal: ");
        String id = input.nextLine();
        System.out.print("Masukkan Nama Kapal: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Stok Kapal: ");
        int stok = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Kecepatan Kapal (Knot): ");
        int kecepatan = input.nextInt();
        input.nextLine();
    
        Kapal kapalBaru = new KapalCepat(id, nama, stok, kecepatan);
        daftarKapal.add(kapalBaru);
        System.out.println("Kapal berhasil ditambahkan!");
    }

    public static void tambahPenyewa() {
        System.out.print("Masukkan ID Penyewa: ");
        String id = input.nextLine();
        System.out.print("Masukkan Nama Penyewa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan No. Telepon: ");
        String noTelp = input.nextLine();

        daftarPenyewa.add(new Penyewa(id, nama, noTelp));
        System.out.println("Penyewa berhasil ditambahkan!");
    }

    public static void tambahNahkoda() {
        System.out.print("Masukkan ID Nahkoda: ");
        String id = input.nextLine();
        System.out.print("Masukkan Nama Nahkoda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan No. Telepon Nahkoda: ");
        String noTelp = input.nextLine();

        daftarNahkoda.add(new Nahkoda(id, nama, noTelp));
        System.out.println("Nahkoda berhasil ditambahkan!");
    }

    public static void sewaKapal() {
        System.out.print("Masukkan ID Penyewa: ");
        String idPenyewa = input.nextLine();

        for (Penyewa p : daftarPenyewa) {
            if (p.getIdPenyewa().equals(idPenyewa)) {
                System.out.print("Masukkan ID Kapal: ");
                String idKapal = input.nextLine();
                for (Kapal k : daftarKapal) {
                    if (k.getIdKapal().equals(idKapal) && k.getStok() > 0) {
                        p.setIdKapal(idKapal);
                        k.setStok(k.getStok() - 1);
                        System.out.println("Kapal berhasil disewa oleh " + p.getNama());
                        return;
                    }
                }
                System.out.println("Kapal tidak tersedia!");
            }
        }
    }
}