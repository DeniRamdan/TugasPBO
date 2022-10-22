package com.sesi4.polimorfism;

class Manager {
    String nama;
    String npk;
    String divisi;

    void display() {
        System.out.println("Nama     : " + this.nama);
        System.out.println("NPK      : " + this.npk);
        System.out.println("Divisi   : " + this.divisi);
    }
}

class Spv extends Manager {
    String Foreman;

   

    void display() {
        System.out.println("Nama     : " + this.nama);
        System.out.println("NPK      : " + this.npk);
        System.out.println("Divisi   : " + super.divisi);

         // Overriding Method
        System.out.println("Anggota Foreman : " + this.Foreman);
    }
}


class Leader extends Manager {
    String jobdesk;

    void display() {
        System.out.println("Nama     : " + this.nama);
        System.out.println("NPK      : " + this.npk);
        System.out.println("Divisi   : " + super.divisi);

        // Overriding Method
        System.out.println("Jobdesk  :" + this.jobdesk);
    }
}

public class Overriding {
    public static void main(String[] args) {
        System.out.println("========================");
        Manager manager = new Manager();
        manager.nama = "Gendro";
        manager.npk = "31122625";
        manager.divisi = "2 Whell Prod";
        manager.display();
        System.out.println("========================");

        Spv spv = new Spv();
        spv.nama = "yusuf";
        spv.npk = "31122689";
        spv.divisi = "2 Whell Prod\n";
        spv.Foreman = "\n 1. kamil \n 2. Budi \n 3. Rojak ";
        spv.display();
        System.out.println("========================");

        Leader leader = new Leader();
        leader.nama = "Udin";
        leader.npk = "31122690";
        leader.divisi = "2 Whell Prod\n";
        leader.jobdesk = "\n 1. Management Team Member\n 2. Management Target\n 3. Management Deffect";
        leader.display();
        System.out.println("========================");
    }
}
