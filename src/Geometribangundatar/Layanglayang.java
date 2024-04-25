/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometribangundatar;

import coba3.Bangundatar;


public class Layanglayang implements Bangundatar{
    
    private double d1,d2;

    public Layanglayang(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    
    @Override
    public double Luas() {
        return 0.5*d1*d2;
    }
    
}
