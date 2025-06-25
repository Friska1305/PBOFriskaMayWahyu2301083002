/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum200325;

/**
 *
 * @author frisk
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public static int JumlahObjek=0;
    
    public PersegiPanjang(){
        JumlahObjek++;
        
    }
    public PersegiPanjang(int panjangBaru,int lebarBaru){
        this.panjang=panjangBaru;
        this.lebar=lebarBaru;
        JumlahObjek++;
    }
    
    public int getLuas(){
        return(panjang*lebar);
    }
    
    public int getKeliling(){
        return 2*(panjang+lebar);
    }
}
