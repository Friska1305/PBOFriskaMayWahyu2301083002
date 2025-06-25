/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum12032025;

/**
 *
 * @author frisk
 */
import java.util.Scanner;
public class MutasiKombinasi {
    public static void main(String[] args) {
        int n, r, i; //n=jumlah total objek r=jumlah objek yang dipilih
        int mutasi=1, kombinasi=1, x=1;

        Scanner input = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.print("Masukkan nilai n: ");
        n = input.nextInt();
        System.out.print("Masukkan nilai r: ");
        r = input.nextInt();
        System.out.println("===================");

        for (i=n; i>(n-r); i--) {
            mutasi *= i;
        }
        for (i=r; i>1; i--) {
            x *= i;
        }

        kombinasi = mutasi / x;

        System.out.println("Nilai Permutasi: "+mutasi);
        System.out.println("Nilai Kombinasi: "+kombinasi);
        System.out.println("--------------------");
    }
    
    
}
