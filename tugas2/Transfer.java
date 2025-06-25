/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author friska
 */
 public class Transfer extends Pembayaran {
    private String namaBank;
    private String nomorRekening;

    public Transfer(double totalHarga, String namaBank, String nomorRekening) {
        super(totalHarga);
        this.namaBank = namaBank;
        this.nomorRekening = nomorRekening;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("\n=== PROSES TRANSFER ===");
        System.out.println("Total: Rp" + totalHarga);
        System.out.println("Bank Pengirim: " + namaBank);
        System.out.println("No. Rekening: " + nomorRekening);
        System.out.println("\nSilakan transfer ke:");
        System.out.println("Bank: BCA");
        System.out.println("No. Rek: 1234567890");
        System.out.println("Atas Nama: Toko ABC");
        
        statusPembayaran = true;
        System.out.println("\nPembayaran transfer berhasil diproses!");
    }

    @Override
    public String getDetailPembayaran() {
        return super.getDetailPembayaran() + " | Metode: Transfer | Bank: " + namaBank;
    }
}   

