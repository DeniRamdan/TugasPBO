package com.sesi5;

class Mahasiswa {
    private String Nama;
    private String Nim;
    private String Jurusan;
    private Double Ipk;

    Mahasiswa(String nama, String nim, String jurusan, Double ipk) {

        this.Nama = nama;
        this.Nim = nim;
        this.Jurusan = jurusan;
        this.Ipk = ipk;
    }

    // Write Only
    public void SetData(String nama, String nim, String jurusan, Double ipk) {
        this.Nama = nama;
        this.Nim = nim;
        this.Jurusan = jurusan;
        this.Ipk = ipk;
    }

    // Read only 

    public String getNama() {
        System.out.println("Nama    : " + Nama);
        return Nama;
    }

    public String getNim() {
        System.out.println("Nim     : " + Nim);
        return Nim;
    }

    public String getJurusan() {
        System.out.println("Jurusan :" + Jurusan);
        return Jurusan;
    }

    public Double getIpk() {
        System.out.println("IPK     :" + Ipk);
        return Ipk;
    }

    public void display() {
        getNama();
        getNim();
        getJurusan();
        getIpk();
        System.out.println("============================");
    }

}