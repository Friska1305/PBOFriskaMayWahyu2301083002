/*
 * Friska May WAhyu
 * TK 1A
 * 2301083002
 */
package FriskaMayWahyuTk1a;

public class PersegiPanjangEnkapsulasi {
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;
    
    //konstruktor default
    public PersegiPanjangEnkapsulasi(int panjangBaru, int lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        jumlahObjek++;
    }
    
    //setter dan getter untuk panjang
    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }
    public int getPanjang() {
        return panjang;
    }
    //setter dan getter untuk lebar
    public void setLebar(int lebarBaru) {
        this.lebar= lebarBaru;
    }
    public int getLebar() {
        return lebar;
    }
    //Getter untuk jumlah objek
    public static int getJumlahObjek(){
        return jumlahObjek;
    }
    //method untuk menghitung luas
    public int getLuas() {
        return panjang * lebar;
    }
    //method untuk menghitung keliling
    public int getKeliling(){
        return 2 * (panjang + lebar);
    }
}

