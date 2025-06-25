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
public abstract class Pembayaran {
    protected double totalHarga;
    protected boolean statusPembayaran;

    public Pembayaran(double totalHarga) {
        this.totalHarga = totalHarga;
        this.statusPembayaran = false;
    }

    public abstract void prosesPembayaran();

    public boolean getStatusPembayaran() {
        return statusPembayaran;
    }

    public String getDetailPembayaran() {
        return "Total: Rp" + totalHarga;
    }
}

