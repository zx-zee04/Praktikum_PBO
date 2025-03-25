import java.util.ArrayList;

public class Penyewa {
    String idPenyewa, nama, noTelp, idKapal;

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
}