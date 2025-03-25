import java.util.ArrayList;

public class Kapal {
    String idKapal, nama;
    int stok;

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
}