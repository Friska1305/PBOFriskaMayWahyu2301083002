/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbaru;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class MainPembayaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total pembayaran: ");
        double totalBayar = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Transfer");
        System.out.println("2. Cash");
        System.out.println("3. E-Wallet");
        System.out.println("4. Kartu Kredit");

        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); 

       Pembayaran pembayaran = null;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nama bank: ");
                String bank = scanner.nextLine();
                pembayaran = new Transfer(totalBayar, bank);
                break;
            case 2:
                pembayaran = new Cash(totalBayar);
                break;
            case 3:
                pembayaran = new EWallet(totalBayar);
                break;
            case 4:
                pembayaran = new KartuKredit(totalBayar);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                scanner.close();
                return;
        }

        pembayaran.prosesPembayaran();
        scanner.close();
    }
}

    
    

