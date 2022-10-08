package com.sesi1;
import java.util.Scanner;

public class Lingkaran{

    public static void main(String[] args) {
        final double phi = 3.14;
        double jari,diameter,luas,keliling;
        
        System.out.println("\n\n==========================================================");
        System.out.println("Nama   : Deni Ramdan Septian");
        System.out.println("NIM    : 20210040055");
        System.out.println("kelas  : TI21C");
        System.out.println("=============================================================");
        System.out.println("\n======= Tugas PBO Sesi 2 luas dan Keliling lingkaran =======\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jari - Jari :");

        jari = input.nextDouble();
        diameter= 2 * jari;
        luas = phi * jari*jari;
        keliling = phi * diameter;
        System.out.println("luas lingkaran tersebut adalah     : "+  luas );
        System.out.println("keliling lingkaran tersebut adalah : "+ keliling);
        System.out.println("\n=============================================================");

    }
    }
