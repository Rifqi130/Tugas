/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometribangunruang;

import Geometribangundatar.Persegi;
import coba3.Bangunruang;


public class Kubus extends Persegi implements Bangunruang {
    
    
    public Kubus(double sisi) {
        super(sisi);
    }
    
    Persegi bangundatar = new Persegi(sisi);
    
    @Override
    public double Volume() {
        return bangundatar.Luas() * sisi;
    }
  
}
