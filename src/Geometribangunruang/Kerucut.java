/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometribangunruang;

import Geometribangundatar.Lingkaran;
import coba3.Bangunruang;

public class Kerucut extends Lingkaran implements Bangunruang {
    public double tkerucut;

    public Kerucut(double tkerucut,double jari_jari) {
        super(jari_jari);
        this.tkerucut = tkerucut;
        
    }

    public double getTkerucut() {
        return tkerucut;
    }

    public void setTkerucut(double tkerucut) {
        this.tkerucut = tkerucut;
    }
    
    @Override
    public double Volume() {
        return 0.33 * Luas() * tkerucut;
    }
    
}
