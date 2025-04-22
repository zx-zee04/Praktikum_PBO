package com.kapal.model;

public class Person {
    protected String nama;
    protected String noTelp;

    public Person(String nama, String noTelp) {
        this.nama = nama;
        this.noTelp = noTelp;
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