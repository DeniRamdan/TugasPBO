package com.sesi3;
import java.util.Scanner;
public class Inharitance
{
   public static void main (String args[])
   {
    Scanner input=new Scanner(System.in);

    System.out.print("Masukan Jumlah Mahasiswa : ");
    int n=input.nextInt();

    String nim[]=new String[n];
    String nama[]=new String[n];
    String status[]=new String[n];
    int nilai[]=new int[n];


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

            } else if(nilai[i] <79 && nilai[i] >=70){
                status[i]="Grade B (Lulus)";

            } else if (nilai[i] <69 && nilai[i] >=60 ){
                status[i]="Grade C (Lulus)";

            }else if (nilai[i] <59 && nilai[i] >=50 ){
                status[i]="Grade D (Tidak Lulus)";

            }else if (nilai[i] <50 ){
                status[i]="Grade e (Tidak Lulus)";
            }else{
                status[i]="Tidak Lulus";
            }


    }
    System.out.println("DAFTAR NILAI MAHASISWA");
    System.out.println("=======================");
    
    for (int i=0; i<n;i++) {
        System.out.println("Nama    : "+nim[i]);
        System.out.println("Nama    : "+nama[i]);
        System.out.println("Nilai   : "+nilai[i]++);
        System.out.println("Stattus : "+status[i]);
        System.out.println("====================");
    }
    
    }
 }