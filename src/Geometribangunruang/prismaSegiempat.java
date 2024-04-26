/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometribangunruang;

import Geometribangundatar.Persegipanjang;
import coba3.Bangunruang;



public class prismaSegiempat extends Persegipanjang implements Bangunruang {

    private double tprisma;


    public prismaSegiempat(double panjang, double lebar, double tprisma) {
        super(panjang, lebar);
        this.tprisma = tprisma;
    }

    public double getTlimas() {
        return tprisma;
    }

    public void setTlimas(double tprisma) {
        this.tprisma = tprisma;
    }
    
     @Override
    public double Volume() {
        return  Luas() * tprisma;
    }
}
