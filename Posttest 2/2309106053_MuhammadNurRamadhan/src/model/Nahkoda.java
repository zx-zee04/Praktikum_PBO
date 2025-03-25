package model;

import java.util.ArrayList;

public class Nahkoda {
    protected String idNahkoda; // Bisa diakses subclass
    String nama; // Default access modifier (hanya bisa diakses dalam package yang sama)
    private String noTelp;

    public Nahkoda(String idNahkoda, String nama, String noTelp) {
        this.idNahkoda = idNahkoda;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    public static void lihatNahkoda(ArrayList<Nahkoda> daftarNahkoda) {
        System.out.println("\nDaftar Nahkoda:");
        for (Nahkoda n : daftarNahkoda) {
            System.out.println("ID: " + n.idNahkoda + ", Nama: " + n.nama + ", No. Telepon: " + n.noTelp);
        }
    }
    
    public String getIdNahkoda() {
        return idNahkoda;
    }

    public void setIdNahkoda(String idNahkoda) {
        this.idNahkoda = idNahkoda;
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
}
