/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometribangunruang;

import Geometribangundatar.Persegipanjang;
import coba3.Bangunruang;



public class Balok extends Persegipanjang implements Bangunruang {

    private double tinggi;

    public Balok(double tinggi, double lebar, double panjang) {
        super(panjang,lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    
    
    Persegipanjang bangundatar = new Persegipanjang (panjang, lebar, tinggi);
    


     @Override
    public double Volume() {
        return bangundatar.Luas() * tinggi;
    }
}
