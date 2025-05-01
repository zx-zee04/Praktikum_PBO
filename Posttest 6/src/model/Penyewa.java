package model;

import java.util.ArrayList;

public class Penyewa implements Sewa {
    private String idPenyewa;
    private String nama;
    private String noTelp;
    private String idKapal;

    public Penyewa(String idPenyewa, String nama, String noTelp) {
        this.idPenyewa = idPenyewa;
        this.nama = nama;
        this.noTelp = noTelp;
        this.idKapal = null;
    }

    public static void lihatPenyewa(ArrayList<Penyewa> daftarPenyewa) {
        System.out.println("\nDaftar Penyewa:");
        for (Penyewa p : daftarPenyewa) {
            System.out.println("ID: " + p.idPenyewa + ", Nama: " + p.nama + ", No. Telepon: " + p.noTelp + ", Kapal Disewa: " + (p.idKapal == null ? "Tidak ada" : p.idKapal));
        }
    }

    public String getIdPenyewa() {
        return idPenyewa;
    }

    public void setIdPenyewa(String idPenyewa) {
        this.idPenyewa = idPenyewa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getIdKapal() {
        return idKapal;
    }

    public void setIdKapal(String idKapal) {
        this.idKapal = idKapal;
    }

    public final void cetakIdentitas() {
        System.out.println("Penyewa: " + nama + ", No.Telp: " + noTelp);
    }

    // Implementasi interface
    @Override
    public void prosesSewa() {
        System.out.println("Penyewa " + nama + " sedang memproses penyewaan kapal...");
    }

    @Override
    public void infoPenyewa() {
        System.out.println("ID: " + idPenyewa + ", Nama: " + nama + ", No.Telp: " + noTelp);
    }
}