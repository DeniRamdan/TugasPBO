package com.sesi4;

import java.util.Scanner;

class Lingkaran {
    static double jari, diameter, luas, keliling;
    static double phi = 3.14;

    // OverLoading Method

    static void display() {
        Scanner input = new Scanner(System.in);
        System.out.println("===== LINGKARAN =====");
        System.out.print(" \nMasukan jari jari : ");
        jari = input.nextDouble();

        luas = phi * jari * jari;
        keliling = 2 * phi * jari;

        System.out.println("\n Luas Lingkaran Adalah     : " + luas);
        System.out.println(" Keliling Lingkaran Adalah : " + keliling);
        System.out.println("\n");
    }
}

class Persegi {
    static int sisi;
    static int luas;

    //OverLoading Method

    static void display() {
        Scanner input = new Scanner(System.in);
        System.out.println("====== PERSEGI =====");
        System.out.print(" Masukan sisi : ");
        sisi = input.nextInt();

        luas = sisi * sisi;
        System.out.println(" Luas Persegi Adalah : " + luas);
        System.out.println("===================");
    }
}

public class OverLoading {
    static int pilih;

    // OverLoading Method

    void display() {
        Scanner input = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Nama  : Deni Ramdan Septian");
        System.out.println("Nim   : 20210040055");
        System.out.println("Kelas : TI21C");
        System.out.println("===============================================");
        System.out.println("== TUGAS PEMROGRAMAN BERORIENTASI OBJEK SESI 4 ==");
        System.out.println("===============================================");
        System.out.println("===================");
        System.out.println("1. Rumus Persegi");
        System.out.println("2. Rumus Lingkaran");
        System.out.println("===================");
        System.out.print("Masukan Pilihan Anda : ");
        pilih = input.nextInt();
        
        if (pilih == 1) {
            Persegi.display();
        } else if (pilih == 2) {
            Lingkaran.display();
        }
    }
    public static void main(String[] args) {

        OverLoading main = new OverLoading();
        main.display();
    }
}
