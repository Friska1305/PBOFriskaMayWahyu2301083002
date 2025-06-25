/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum200325;

/**
 *
 * @author frisk
 */
public class VehicleEnkapsulasi {
    private double load;
    private double maxLoad;
    
    public VehicleEnkapsulasi(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public double getLoad(){
        return load;
    }
    public double getMaxLoad(){
        return maxLoad;
    }
    public void setMaxLoad(double maxLoad){
        this.maxLoad=maxLoad;
    }
    public boolean addbox(double weight){
        double temp = load+weight;
        if(temp<=maxLoad){
            this.load=temp;
            return true;
        }else //temp>maxLoad
            return false;
        //endif
    }
}
