/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum17042025;

/**
 *
 * @author frisk
 */
public class MainHewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //pembuatan objek
        Hewan hewanku=new Hewan ("Makhluk hidup");
        Kucing kucingku=new Kucing("Bobby");
        Anjing anjingku=new Anjing ("Helly");
        //mengakses super class
        System.out.println("Tampilkan akses sub class Hewan");
        hewanku.tampilkanNama();
        hewanku.bersuara();
        //mengakses sub class Kucing
        System.out.println("\nTampilkan akses sub class kucing");
        kucingku.tampilkanNama();
        kucingku.bersuara();
        
        //mengakses sub class anjing
        System.out.println("\nTampilkan akses sub class anjing");
        anjingku.tampilkanNama();
        anjingku.bersuara();
    }
}
