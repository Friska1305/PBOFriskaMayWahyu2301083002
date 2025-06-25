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
public class EWallet extends Pembayaran {
    public EWallet(double totalBayar) {
        super(totalBayar);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran dilakukan melalui E-Wallet sebesar " + totalBayar);
    }
}


