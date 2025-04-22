package com.kapal.model;

import java.util.ArrayList;

public class Penyewa extends Person {
    private String idPenyewa;
    private String idKapal;

    public Penyewa(String idPenyewa, String nama, String noTelp) {
        super(nama, noTelp);
        this.idPenyewa = idPenyewa;
        this.idKapal = null;
    }

    public static void lihatPenyewa(ArrayList<Penyewa> daftarPenyewa) {
        System.out.println("\nDaftar Penyewa:");
        for (Penyewa p : daftarPenyewa) {
            System.out.println("ID: " + p.idPenyewa + ", Nama: " + p.getNama() + ", No. Telepon: " + p.getNoTelp() + ", Kapal Disewa: " + (p.idKapal == null ? "Tidak ada" : p.idKapal));
        }
    }

    public String getIdPenyewa() {
        return idPenyewa;
    }

    public void setIdPenyewa(String idPenyewa) {
        this.idPenyewa = idPenyewa;
    }

    public String getIdKapal() {
        return idKapal;
    }

    public void setIdKapal(String idKapal) {
        this.idKapal = idKapal;
    }
}


// import java.util.ArrayList;

// public class Penyewa {
//     private String idPenyewa;
//     private String nama;
//     private String noTelp;
//     private String idKapal;

//     public Penyewa(String idPenyewa, String nama, String noTelp) {
//         this.idPenyewa = idPenyewa;
//         this.nama = nama;
//         this.noTelp = noTelp;
//         this.idKapal = null;
//     }

//     public static void lihatPenyewa(ArrayList<Penyewa> daftarPenyewa) {
//         System.out.println("\nDaftar Penyewa:");
//         for (Penyewa p : daftarPenyewa) {
//             System.out.println("ID: " + p.idPenyewa + ", Nama: " + p.nama + ", No. Telepon: " + p.noTelp + ", Kapal Disewa: " + (p.idKapal == null ? "Tidak ada" : p.idKapal));
//         }
//     }

//     public String getIdPenyewa() {
//         return idPenyewa;
//     }

//     public void setIdPenyewa(String idPenyewa) {
//         this.idPenyewa = idPenyewa;
//     }

//     public String getNama() {
//         return nama;
//     }

//     public void setNama(String nama) {
//         this.nama = nama;
//     }

//     public String getNoTelp() {
//         return noTelp;
//     }

//     public void setNoTelp(String noTelp) {
//         this.noTelp = noTelp;
//     }

//     public String getIdKapal() {
//         return idKapal;
//     }

//     public void setIdKapal(String idKapal) {
//         this.idKapal = idKapal;
//     }
// }
