/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        int nX, nY, nZ;
        double totalX, totalY, totalZ, diskonX = 0, diskonY = 0 , diskonZ = 0;
        final int hargaX = 40000, hargaY = 50000, hargaZ = 60000;
        Scanner in = new Scanner(System.in);
        System.out.println("-- Pembelian Kotak Susu --");
        System.out.print("Jumlah Merk X: ");
        nX = in.nextInt();
        System.out.print("Jumlah Merk Y: ");
        nY = in.nextInt();
        System.out.print("Jumlah Merk Z: ");
        nZ = in.nextInt();

        totalX = nX * hargaX;
        totalY = nY * hargaY;
        totalZ = nZ * hargaZ;

        if (nX >= 3)
            diskonX = totalX * 0.10;
        if (nY > 3)
            diskonY = totalY * 0.12;
        if (nZ > 1)
            diskonZ = (nZ - 1) * hargaZ * 0.15;
        
        double totalDiskon = diskonX + diskonY + diskonZ;
        double totalPembelian = totalX + totalY + totalZ;
        double totalBayar = totalPembelian - totalDiskon;
        
        System.out.println("Total pembelian : Rp. " + totalPembelian);
        System.out.println("Total diskon    : Rp. " + totalDiskon);
        System.out.println("Total pembayaran: Rp. " + totalBayar);
    }
}

  
