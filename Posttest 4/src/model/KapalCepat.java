package model;

public class KapalCepat extends Kapal {
    private int kecepatan;

    public KapalCepat(String idKapal, String nama, int stok, int kecepatan) {
        super(idKapal, nama, stok);
        this.kecepatan = kecepatan;
    }

    @Override
    public void setStok(int stok) {
        System.out.println("Overridden: Menyetel stok di kapal cepat.");
        super.setStok(stok); // tetap pakai logika validasi dari superclass
    }

    // Overloading method: menampilkan info kapal dengan kecepatan
    public void tampilkanInfo() {
        System.out.println("Kapal Cepat - Nama: " + getNama() + ", Kecepatan: " + kecepatan + " knot");
    }

    public void tampilkanInfo(boolean detail) {
        if (detail) {
            System.out.println("Detail Kapal Cepat -> ID: " + getIdKapal() + ", Nama: " + getNama() +
                    ", Stok: " + getStok() + ", Kecepatan: " + kecepatan + " knot");
        } else {
            tampilkanInfo();
        }
    }
}
