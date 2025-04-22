package com.kapal.model;

public class PetugasAdministrasi extends Person {
    private String idPetugas;

    public PetugasAdministrasi(String idPetugas, String nama, String noTelp) {
        super(nama, noTelp);
        this.idPetugas = idPetugas;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public void catatTransaksi() {
        System.out.println("Petugas " + nama + " sedang mencatat transaksi...");
    }
}