/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometribangunruang;

import Geometribangundatar.Lingkaran;
import coba3.Bangunruang;

public class Bola extends Lingkaran implements Bangunruang {
    private double jari_jari;

    public Bola(double jari_jari) {
        super(jari_jari);
    }

    Lingkaran bangundatar = new Lingkaran(jari_jari);
    
    @Override
    public double Volume() {
        return 1.33*bangundatar.Luas() * jari_jari;
    }
    
}
