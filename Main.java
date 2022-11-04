package com.sesi5;

import java.util.Scanner;

public class Main {

    void display() {
        System.out.println("==============================================");
        System.out.println("Nama  : Deni Ramdan Septian");
        System.out.println("Nim   : 20210040055");
        System.out.println("Kelas : TI21C");
        System.out.println("===============================================");
        System.out.println("== TUGAS PEMROGRAMAN BERORIENTASI OBJEK SESI 5 ==");
        System.out.println("===============================================");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;

        Main main = new Main();
        main.display();
        for (int i = 0; i <= 99; i++) {

            System.out.println("==========================");
            System.out.println("1. MAHASISWA");
            System.out.println("2. DOSEN");
            System.out.println("==========================");
            System.out.print("Masukan pilihan data yang ingin ditampilkan : ");
            pilih = input.nextInt();

            if (pilih == 1) {

                System.out.println("\n****** MAHASISWA *******\n");
                Mahasiswa mahasiswa1 = new Mahasiswa("ROBERT", "20210040044", "Teknik Informatika", 3.90);
                mahasiswa1.display();
                Mahasiswa mahasiswa2 = new Mahasiswa("Jack", "20210040049", "Teknik Informatika", 3.50);
                mahasiswa2.display();
                Mahasiswa mahasiswa3 = new Mahasiswa("Pukis", "20210040033", "Teknik Informatika", 3.68);
                mahasiswa3.display();
            } else if (pilih == 2) {

                System.out.println("\n******** D0SEN ********\n");
                Dosen dosen1 = new Dosen("Rozak", "21094239", "Rekayasa Perangkat Lunak");
                dosen1.display();
                Dosen dosen2 = new Dosen("ABDUL", "21094239", "Organisasi Komputer");
                dosen2.display();
                Dosen dosen3 = new Dosen("AHMAD", "21094239", "Basis Data");
                dosen3.display();
            } else {
                System.out.println("Data Tidak Ditemukan");
            }
        }

    }
}
