/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometribangunruang;

import Geometribangundatar.Persegi;
import coba3.Bangunruang;



public class limasSegiempat extends Persegi implements Bangunruang {

    private double tlimas;


    public limasSegiempat(double sisi, double tlimas) {
        super(sisi);
        this.tlimas = tlimas;
    }

   

    public double getTlimas() {
        return tlimas;
    }

    public void setTlimas(double tlimas) {
        this.tlimas = tlimas;
    }

   
     @Override
    public double Volume() {
        return 0.33 * Luas() * tlimas;
    }
}
