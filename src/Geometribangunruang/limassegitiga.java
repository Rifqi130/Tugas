/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometribangunruang;

import Geometribangundatar.Segitiga;
import coba3.Bangunruang;



public class limassegitiga extends Segitiga implements Bangunruang {

    private double tlimas;

    public limassegitiga(double alas, double tinggi, double tlimas) {
        super(alas,tinggi);
        this.tlimas = tlimas;
    }

    public double getTlimas() {
        return tlimas;
    }

    public void setTlimas(double tlimas) {
        this.tlimas = tlimas;
    }

   
    
    Segitiga bangundatar = new Segitiga (alas, tinggi, tlimas);
    
     @Override
    public double Volume() {
        return 0.33 * bangundatar.Luas() * tlimas;
    }
}
