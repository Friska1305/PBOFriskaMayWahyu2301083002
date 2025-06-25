/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum200325;

import java.util.Scanner;

/**
 *
 * @author frisk
 */
public class TestPersegiPanjang {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("kondisi awal, sebelum pembuatan objek");
        System.out.println("Jumalah persegi panjang ="+PersegiPanjang.JumlahObjek);
        
        PersegiPanjang pp1 = new PersegiPanjang(8,5);
        System.out.println("Panjang = "+pp1.panjang);
        System.out.println("Lebar = "+pp1.lebar);
        
        System.out.println("Luas = "+pp1.panjang+"*"+pp1.lebar+"="+pp1.getLuas());
        System.out.println("Jumlah persegi panjang saat ini ="+PersegiPanjang.JumlahObjek);
        
        
        PersegiPanjang pp2 = new PersegiPanjang();
        System.out.print("Masukkan Panjang =");
        pp2.panjang=in.nextInt();
        System.out.print("Masukkan Lebar =");
        pp2.lebar=in.nextInt();
        System.out.println("Luas persegi panjang 2="+pp2.panjang+"*"+pp2.lebar+"="+pp1.getLuas());
        System.out.println("Keliling = "+pp2.getKeliling());
        System.out.println("Jumlah persegi panjang saat ini"+PersegiPanjang.JumlahObjek);
        
    }
    
}

