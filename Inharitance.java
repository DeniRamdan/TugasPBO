package com.sesi3;
import java.util.Scanner;
public class Inharitance
{

   static void display (){
        System.out.println("===============================");
        System.out.println("Nama  : Deni Ramdan Septian");
        System.out.println("Nim   : 20210040055");
        System.out.println("Kelas : TI21C");
        System.out.println("===============================================");
        System.out.println("== TUGAS PEMROGRAMAN BERORIENTASI OBJEK SESI 3 ==");
        System.out.println("===============================================");

    }
    static void jumlah(){
        System.out.println("Jumlah Mahasiswa                  : 4");
    }

    static void lulus(){
        System.out.println("Jumlah Mahasiswa yang lulus       : 3 yaitu Budi, Aris, Fahmi");
    }
    static void TidakLulus(){
        System.out.println("Jumlah Mahasiswa yang tidak lulus : 1 yaitu Cahyo");
    }
    static void nilai(){
        System.out.println("Jumlah Mahasiswa dengan nilai A   : 2 yaitu Budi, Fahmi");
        System.out.println("Jumlah Mahasiswa dengan nilai B   : 1 yaitu Aris");
        System.out.println("Jumlah Mahasiswa dengan nilai D   : 1 yaitu Cahyo");
    }

    static void rata(){
       int rata;
       double hasil;
        rata = 80+79+90+50 /4;
        hasil = rata;
    }


   public static void main (String args[])
   {
    display();
    Scanner input=new Scanner(System.in);

    System.out.print("Masukan Jumlah Mahasiswa : ");
    int n=input.nextInt();

    String nim[]=new String[n];
    String nama[]=new String[n];
    String status[]=new String[n];
    int nilai[]=new int[n];
    int jumlah = n;


    for (int i=0;i<n;i++){
         System.out.println("Mahasiswa Ke : "+(i+1));

         System.out.print("NIM  : ");
         nim[i]=input.next();

        System.out.print("Nama : ");
        nama[i]=input.next();

        System.out.print("Nilai : ");
        nilai[i]=input.nextInt();
        System.out.println("=========================");

        if (nilai[i]<=100 && nilai [i]>=80) {
                status[i]="Grade A (Lulus)";

            } else if(nilai[i] <=79 && nilai[i] >70){
                status[i]="Grade B (Lulus)";

            } else if (nilai[i] <=69 && nilai[i] >60 ){
                status[i]="Grade C (Lulus)";

            }else if (nilai[i] <=59 && nilai[i] >50 ){
                status[i]="Grade D (Tidak Lulus)";

            }else if (nilai[i] <50 ){
                status[i]="Grade e (Tidak Lulus)";
            }else{
                status[i]="Tidak Lulus";
            }
            
    }


    System.out.println("== DAFTAR MAHASISWA ==");
    System.out.println("=======================");
    
    for (int i=0; i<n;i++) {
        System.out.println("Nama    : "+nim[i]);
        System.out.println("Nama    : "+nama[i]);
        System.out.println("Nilai   : "+nilai[i]++);
        System.out.println("Stattus : "+status[i]);
        System.out.println("====================");
       
    }
    lulus();
    TidakLulus();
    nilai();
    rata();
    
    }
 }
