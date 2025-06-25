/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum200325;

/**
 *
 * @author frisk
 */

import java.util.Scanner;

public class TestVehicleEnkapsulasi {
    public static void main(String[] args) {
        // berat maksimum kendaraan
        System.out.println("Buat kendaraan maksimum 10000");

        // perbaiki nama package sesuai dengan lokasi class VehicleEnkapsulasi
        Pratikum200325.VehicleEnkapsulasi kend1 = new Pratikum200325.VehicleEnkapsulasi(10000);

        // menambahkan berat kendaraan
        System.out.println("Menambahkan beban 1 (500 kg): " + kend1.addBox(500));
        System.out.println("Menambahkan beban 2 (1000 kg): " + kend1.addBox(1000));
        System.out.println("Menambahkan beban 3 (5000 kg): " + kend1.addBox(5000));
        System.out.println("Menambahkan beban 4 (750 kg): " + kend1.addBox(750));
        System.out.println("Menambahkan beban 5 (3000 kg): " + kend1.addBox(3000));

        // beban kendaraan saat ini
        System.out.println("Beban Kendaraan saat ini:");
        System.out.println(kend1.getLoad() + " kg");

        Scanner in = new Scanner(System.in);

        // buat objek kedua dengan konstruktor kosong
        Praktikum200325.VehicleEnkapsulasi kend2 = new Praktikum200325.VehicleEnkapsulasi();
        System.out.print("Beban maksimal kendaraan = ");
        double bebanmax = in.nextDouble();
        kend2.setMaxLoad(bebanmax);

        System.out.print("Masukkan beban ke kendaraan berat = ");
        double beban = in.nextDouble();
        while (kend2.addBox(beban)) {
            System.out.print("Masukkan beban ke kendaraan berat = ");
            beban = in.nextDouble();
        }

        System.out.println("Maaf, beban berlebih. Penambahan dibatalkan.");
        System.out.println("Beban kendaraan saat ini:");
        System.out.println(kend2.getLoad() + " kg");
    }
}
