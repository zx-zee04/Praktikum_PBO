package model;

import java.util.ArrayList;

public abstract class Kapal {
    private final String idKapal;
    private String nama;
    protected int stok;
    private static int jumlahKapal = 0;

    public Kapal(String idKapal, String nama, int stok) {
        this.idKapal = idKapal;
        this.nama = nama;
        this.stok = stok;
        jumlahKapal++;
    }

    // public static void lihatKapal(ArrayList<Kapal> daftarKapal) {
    //     System.out.println("\nDaftar Kapal:");
    //     for (Kapal k : daftarKapal) {
    //         System.out.println("ID: " + k.idKapal + ", Nama: " + k.nama + ", Stok: " + k.stok);
    //     }
    // }

    public static void lihatKapal(ArrayList<Kapal> daftarKapal) {
        if (daftarKapal.isEmpty()) {
            System.out.println("Belum ada kapal yang tersedia.");
            return;
        }

        System.out.println("\nDaftar Kapal:");
        for (int i = 0; i < daftarKapal.size(); i++) {
            Kapal k = daftarKapal.get(i);
            System.out.println((i + 1) + ". " + k.getNama() + " (ID: " + k.getIdKapal() + ", Stok: " + k.getStok() + ")");
        }
    }

    public static void Tespolymorphism(ArrayList<Kapal> daftarKapal) {
        System.out.println("\nDaftar Kapal:");
            for (Kapal k : daftarKapal) {
                k.infoKapal(); // polymorphism
            }
    }

    public static int getJumlahKapal() {
        return jumlahKapal;
    }

    public String getIdKapal() {
        return idKapal;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak boleh negatif!");
        }
    }

    public abstract void infoKapal();
}
