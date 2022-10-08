package com.sesi2;
public class Handphone{

    public String nama_hp;
    public int tahun_hp;

    public void setDataHp(String nama_hp , int tahun_hp ){
        this.nama_hp = nama_hp;
        this.tahun_hp = tahun_hp;
    }

    public String getNama(){
        return nama_hp;
    }
    public int getTahun(){
        return tahun_hp;
    }
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("Nama  : Deni Ramdan Septian");
        System.out.println("Nim   : 20210040055");
        System.out.println("Kelas : TI21C \n");
        System.out.println("============ Class Dan Object sesi 2 ===========");
        Handphone handphoneku = new Handphone();
        handphoneku.setDataHp("INFINIX",  2019);
        System.out.println("Nama Handphone : "+ handphoneku.getNama());
        System.out.println("Tahun Hp       : "+ handphoneku.getTahun());
        System.out.println("================================================");
    }
}