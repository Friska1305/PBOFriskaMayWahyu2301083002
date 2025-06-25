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
public class Anjing extends Hewan{
      public Anjing (String nama){
        super(nama);
    }
    
    @Override
    public void bersuara(){
        System.out.println(nama+"berkata GUK!! GUK!!");
    }
    
}
