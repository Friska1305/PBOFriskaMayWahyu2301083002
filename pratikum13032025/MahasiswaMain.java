/*
 * Friska May Wahyu
 * 2301083002
 * TK1a
 */
package pratikum13032025;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        long nim;
        String nama;
        int tugas;
        int quiz;
        int uts;
        int uas;
        
        Scanner in=new Scanner(System.in);
        ///meminta input
        System.out.print("Masukkan NIM = ");
        nim = in.nextLong();
        in.nextLine();
        
        System.out.print("Masukkan Nama = ");
        nama = in.nextLine();
        
        System.out.print("Masukkan Nilai Tugas = ");
        tugas = in.nextInt();
        
        System.out.print("Masukkan Nilai quiz = ");
        quiz = in.nextInt();
        
        System.out.print("Masukkan Nilai UTS = ");
        uts = in.nextInt();
        
        System.out.print("Masukkan Nilai UAS = ");
        uas = in.nextInt();
        
        ///deklarasi objek
        Mahasiswa orang = new Mahasiswa(nim, nama, tugas, uts, uas, quiz);
        
        System.out.println("--Informasi Mahasiswa--");
        orang.TampilData();
        
        System.out.println("---Nilai Akhir---");
        orang.NilaiAkhir();
        
        System.out.println("\n---Konversi Nilai---");
        orang.KonversiNilai();
    }
    
}

    

