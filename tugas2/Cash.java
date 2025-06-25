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
public class Cash extends Pembayaran {
    public Cash(double totalHarga) {
        super(totalHarga);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("\n=== PEMBAYARAN CASH ===");
        System.out.println("Total: Rp" + totalHarga);
        System.out.println("\nSilakan bayar cash ke kasir terdekat");
        
        statusPembayaran = true;
        System.out.println("\nPembayaran tunai berhasil diproses!");
    }

    @Override
    public String getDetailPembayaran() {
        return super.getDetailPembayaran() + " | Metode: Cash";
    }
}
