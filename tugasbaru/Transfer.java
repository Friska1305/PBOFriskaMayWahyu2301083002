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
public class Transfer extends Pembayaran{
    private String namaBank;

    public Transfer(double totalBayar, String namaBank) {
        super(totalBayar);
        this.namaBank = namaBank;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran melalui transfer ke bank " + namaBank + " sebesar " + totalBayar);
    }
}

