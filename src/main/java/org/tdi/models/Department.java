package org.tdi.models;

public class Department {
    private int id;
    private String nama;
    private  String dekripsi;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + nama + '\'' +
                ", dekripsi='" + dekripsi + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getDekripsi() {
        return dekripsi;
    }

    public void setDekripsi(String dekripsi) {
        this.dekripsi = dekripsi;
    }

}


