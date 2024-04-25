/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometribangunruang;

import Geometribangundatar.Persegipanjang;
import coba3.Bangunruang;



public class Balok extends Persegipanjang implements Bangunruang {

    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang);
        super(lebar);
        this.tinggi = new tinggi;
    }
    Persegipanjang bangundatar = new Persegipanjang (tinggi);


     @Override
    public double Volume() {
        return bangundatar.Luas() * tinggi;
    }
    
}
