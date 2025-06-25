/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author frisk
 */
import java.util.Scanner;

public class MainPembayaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SELAMAT DATANG DI SISTEM PEMBAYARAN ===");
        System.out.print("Silakan masukkan total harga pembelian: Rp");
        double totalHarga = input.nextDouble();
        input.nextLine(); // bersihkan buffer

        System.out.println("\n-- Pilih Metode Pembayaran --");
        System.out.println("1. Transfer melalui Bank");
        System.out.println("2. Pembayaran Tunai");
        System.out.println("3. Dompet Digital (E-Wallet)");
        System.out.println("4. Pembayaran via Kartu Kredit");
        System.out.print("Masukkan pilihan Anda (1-4): ");
        int pilihan = input.nextInt();
        input.nextLine();

        Pembayaran transaksi = null;

        switch (pilihan) {
            case 1:
                System.out.print("Nama Bank: ");
                String namaBank = input.nextLine();
                System.out.print("Nomor Rekening: ");
                String nomorRekening = input.nextLine();
                transaksi = new Transfer(totalHarga, namaBank, nomorRekening);
                break;
            case 2:
                transaksi = new Cash(totalHarga);
                break;
            case 3:
                System.out.print("Pilih Provider E-Wallet (Gopay/OVO/Dana/LinkAja): ");
                String provider = input.nextLine();
                transaksi = new EWallet(totalHarga, provider);
                break;
            case 4:
                System.out.print("Masukkan nomor kartu kredit: ");
                String nomorKartu = input.nextLine();
                System.out.print("Bank Penerbit Kartu: ");
                String bankPenerbit = input.nextLine();
                transaksi = new KartuKredit(totalHarga, nomorKartu, bankPenerbit);
                break;
            default:
                System.out.println("Input tidak valid. Program dihentikan.");
                return;
        }

        // Proses pembayaran
        transaksi.prosesPembayaran();

        // Tampilkan ringkasan
        System.out.println("\n--- RINGKASAN PEMBAYARAN ---");
        System.out.println(transaksi.getDetailPembayaran());
        String status = transaksi.getStatusPembayaran() ? "Transaksi Berhasil" : "Transaksi Gagal";
        System.out.println("Status: " + status);

        input.close();
    }
}

    