/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbaru;

/**
 *
 * @author user
 */
public class Pembayaran {
    protected double totalBayar;

    public Pembayaran(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public void prosesPembayaran() {
        System.out.println("Proses pembayaran sebesar: " + totalBayar);
    }
}


