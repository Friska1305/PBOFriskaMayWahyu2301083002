/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum17042025;

/**
 *
 * @author frisk
 */
public class Udara extends Kendaraan{
    private boolean mesin;
    
    public Udara(){    
        super();
    }
    
    public Udara(String nama, int tahunProduksi, boolean mesin){
        super(nama, tahunProduksi);
        this.mesin=mesin;
    }
    
    public boolean getMesin(){
        return mesin;
    }
    
    public void setMesin(boolean Mesin){
        this.mesin=mesin;
    }
    
    public void Cetak(){
        super.Cetak();
        System.out.println("Menggunkan mesin="+(mesin? "Ya": "Tidak"));
    }
}
