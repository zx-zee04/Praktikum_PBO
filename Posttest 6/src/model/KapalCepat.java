package model;

public class KapalCepat extends Kapal {
    private final int kecepatan;
    private static int counter = 1;

    public KapalCepat(String nama, int stok, int kecepatan) {
        super(String.format("KC%03d", counter++), nama, stok);
        this.kecepatan = kecepatan;
    }

    @Override
    public void setStok(int stok) {
        System.out.println("Overridden: Menyetel stok di kapal cepat.");
        super.setStok(stok);
    }

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

    // ✅ Implementasi abstract method dari superclass
    @Override
    public void infoKapal() {
        System.out.println("Ini adalah kapal cepat bernama " + getNama() + " dengan kecepatan " + kecepatan + " knot.");
    }
}
