/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum13032025;

import java.util.Scanner;

/**
 *
 * @author frisk
 */
public class KendaraanMain {
     public static void main(String[] args){
        String jns;
        int thn;
        String wrn;
        
        Scanner in = new Scanner(System.in);
        ///meminta input
        System.out.println("Masukkan jenis kendaraan = ");
        jns = in.nextLine();
        System.out.println("Tahun keluaran = ");
        thn =in.nextInt();
        in.nextLine();///
        System.out.println("Warna kendaraan = ");
        wrn = in.nextLine();
        
        ///inputka data kecepatan max kendaraan
        System.out.println("Masukkan data kecepatan max per ");
        in.nextInt();
        ///deklarasikan objek
        Kendaraan mobil1 = new Kendaraan(jns,thn,wrn);
        System.out.println("\n==Informasi Kendaraan 1 --");
        mobil1.TampilData();
        
        mobil1.TipeKendaraan();
     }
}
