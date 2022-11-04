package com.sesi5;


class Dosen{
    private String Nama;
    private String Nip;
    private String MataKuliah;

    Dosen(String nama, String nip, String matkul) {

        this.Nama = nama;
        this.Nip = nip;
        this.MataKuliah = matkul;
    }

    //Write Only

    public void SetData(String nama, String nip,String matkul) {
        this.Nama = nama;
        this.Nip = nip ;
        this.MataKuliah = matkul;
    }

    //Read Only
    public String getNama() {
        System.out.println("Nama    : " + Nama);
        return Nama;
    }

    public String getNim() {
        System.out.println("Nim     : " + Nip);
        return Nip;
    }

    public String getMataKuliah() {
        System.out.println("Jurusan : " + MataKuliah);
        return MataKuliah;
    }


    public void display() {
        getNama();
        getNim();
        getMataKuliah();
        System.out.println("==============================");
    }

}