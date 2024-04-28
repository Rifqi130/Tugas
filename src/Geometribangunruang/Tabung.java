/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometribangunruang;

import Geometribangundatar.Lingkaran;
import coba3.Bangunruang;

public class Tabung extends Lingkaran implements Bangunruang{
    private double ttabung;
    
    public Tabung(double ttabung,double jari_jari ) {
     super (jari_jari);
     this.ttabung = ttabung;
    }

    public double getTtabung() {
        return ttabung;
    }

    public void setTtabung(double ttabung) {
        this.ttabung = ttabung;
    }
    
    @Override
    public double Volume() {
        return  Luas() * ttabung;
        
    }
    

   
}
