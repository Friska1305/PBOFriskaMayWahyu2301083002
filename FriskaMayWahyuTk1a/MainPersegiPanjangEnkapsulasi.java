/*
 * Friska May WAhyu
 * TK 1A
 * 2301083002
 */
package FriskaMayWahyuTk1a;

import java.util.Scanner;


public class MainPersegiPanjangEnkapsulasi {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
        System.out.println("kondisi awal, sebelum pembuatan objek");
        System.out.println("Jumlah persegi panjang = "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi(0,0);
        System.out.println("Panjang = "+pp1.getPanjang());
        System.out.println("Lebar = "+pp1.getLebar());
        
        System.out.println("Luas persegi panjang 1 = "+pp1.getPanjang()+" * "+pp1.getLebar()+" = "+pp1.getLuas());
        System.out.println("Keliling persegi panjang 1 = "+pp1.getKeliling());
        System.out.println("Jumlah persegi panjang saat ini= "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(6,7);
        System.out.println("Panjang = "+pp2.getPanjang());
        System.out.println("Lebar = "+pp2.getLebar());
        
        System.out.println("Luas persegi panjang 2 = "+pp2.getPanjang()+" * "+pp2.getLebar()+" = "+pp2.getLuas());
        System.out.println("Keliling persegi panjang 2 = "+pp2.getKeliling());
        System.out.println("Jumlah persegi panjang saat ini= "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(8,5);
        System.out.println("Panjang = "+pp3.getPanjang());
        System.out.println("Lebar = "+pp3.getLebar());
        
        System.out.println("Luas persegi panjang 3 = "+pp3.getPanjang()+" * "+pp3.getLebar()+" = "+pp3.getLuas());
        System.out.println("Keliling persegi panjang 3 = "+pp3.getKeliling());
        System.out.println("Jumlah persegi panjang saat ini= "+PersegiPanjangEnkapsulasi.getJumlahObjek());
    }   
    
}
