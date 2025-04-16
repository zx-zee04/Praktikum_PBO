package model;

import java.util.ArrayList;

public class Kapal {
    private String idKapal;
    private String nama;
    protected int stok;

    public Kapal(String idKapal, String nama, int stok) {
        this.idKapal = idKapal;
        this.nama = nama;
        this.stok = stok;
    }

    public static void lihatKapal(ArrayList<Kapal> daftarKapal) {
        System.out.println("\nDaftar Kapal:");
        for (Kapal k : daftarKapal) {
            System.out.println("ID: " + k.idKapal + ", Nama: " + k.nama + ", Stok: " + k.stok);
        }
    }

    public String getIdKapal() {
        return idKapal;
    }

    public void setIdKapal(String idKapal) {
        this.idKapal = idKapal;
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
}