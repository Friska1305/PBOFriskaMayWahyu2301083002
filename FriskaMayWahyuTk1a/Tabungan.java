/*
 * Friska May WAhyu
 * TK 1A
 * 2301083002
 */
package FriskaMayWahyuTk1a;


public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }
    public boolean ambilUang(int jumlah) {
        if(jumlah <= saldo) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }
    public boolean transfer(Tabungan t, int jumlah) {
        if(ambilUang(jumlah)) {
            t.simpanUang(jumlah);
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Saldo: " + saldo;
    }

    void simpanUang(Tabungan tabungan1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void simpanUang(double tabung2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean ambilUang(double ambil2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
} 
    

