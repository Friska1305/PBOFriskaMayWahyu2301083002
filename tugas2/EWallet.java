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
public class EWallet extends Pembayaran {
    private String provider;

    public EWallet(double totalHarga, String provider) {
        super(totalHarga);
        this.provider = provider;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("\n=== PEMBAYARAN E-WALLET ===");
        System.out.println("Total: Rp" + totalHarga);
        System.out.println("Provider: " + provider);
        System.out.println("\nSilakan scan QR code berikut:");
        System.out.println("[QR Code E-Wallet]");
        
        statusPembayaran = true;
        System.out.println("\nPembayaran E-Wallet berhasil diproses!");
    }

    @Override
    public String getDetailPembayaran() {
        return super.getDetailPembayaran() + " | Metode: E-Wallet | Provider: " + provider;
    }
}

