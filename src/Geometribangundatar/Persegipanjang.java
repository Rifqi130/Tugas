/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometribangundatar;


import coba3.Bangundatar;


public class Persegipanjang implements Bangundatar{
    
    protected double panjang, lebar;

    public Persegipanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public Persegipanjang(double panjang, double lebar, double tinggi) {
         this.panjang = panjang;
         this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    
    @Override
    public double Luas() {
        return panjang * lebar;
    }
    
    
    
    
}
