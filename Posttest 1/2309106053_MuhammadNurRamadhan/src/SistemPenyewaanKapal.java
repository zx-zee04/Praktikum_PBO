import java.util.ArrayList;
import java.util.Scanner;

public class SistemPenyewaanKapal {
    static ArrayList<Kapal> daftarKapal = new ArrayList<>();
    static ArrayList<Penyewa> daftarPenyewa = new ArrayList<>();
    static ArrayList<Nahkoda> daftarNahkoda = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void tambahKapal() {
        System.out.print("Masukkan ID Kapal: ");
        String id = input.nextLine();
        System.out.print("Masukkan Nama Kapal: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Stok Kapal: ");
        int stok = input.nextInt();
        input.nextLine();

        daftarKapal.add(new Kapal(id, nama, stok));
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

        Penyewa penyewa = null;
        for (Penyewa p : daftarPenyewa) {
            if (p.idPenyewa.equals(idPenyewa)) {
                penyewa = p;
                break;
            }
        }

        if (penyewa == null) {
            System.out.println("Penyewa tidak ditemukan!");
            return;
        }

        System.out.print("Masukkan ID Kapal yang ingin disewa: ");
        String idKapal = input.nextLine();

        for (Kapal k : daftarKapal) {
            if (k.idKapal.equals(idKapal) && k.stok > 0) {
                penyewa.idKapal = idKapal;
                k.stok--;
                System.out.println("Kapal berhasil disewa oleh " + penyewa.nama);
                return;
            }
        }
        System.out.println("Kapal tidak tersedia atau tidak ditemukan!");
    }
}