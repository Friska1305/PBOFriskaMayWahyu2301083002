/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asaaa
 */
public class TestVehicle {
    public static void main(String[] args){
        //bust krndaraan dengan beban maksimal 10000kg
        System.out.println("Buat kendaraan max beban 10000kg");
        Vehicle kendl = new Vehicle(10000);
        
        //menambahkan beberapa beban ke kendaraan
        System.out.println("Menambahkan beban 1 (500kg) ");
        kendl.load=kendl.load+500;
        System.out.println("Menambahkan beban 2 (1000kg) ");
        kendl.load=kendl.load+1000;
        System.out.println("Menambahkan beban 3 (5000kg) ");
        kendl.load=kendl.load+5000;
        System.out.println("Menambahkan beban 4 (750kg) ");
        kendl.load=kendl.load+750;
        System.out.println("Menambahkan beban 5 (3000kg) ");
        kendl.load=kendl.load+3000;
        
        //menampilkan beban kendaraan saat ini
        System.out.println("beban kendaraan saat ini");
        System.out.println(kendl.getLoad()+" kg");
    }
    
}
