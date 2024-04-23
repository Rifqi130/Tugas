/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometribangundatar;


import coba3.Bangundatar;

import javax.swing.JTextField;

public class Persegipanjang implements Bangundatar{
    
    private double panjang, tinggi;

    public Persegipanjang(double panjang, double tinggi) {
        this.panjang = panjang;
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public Persegipanjang(JTextField sisi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    @Override
    public double Luas() {
        return panjang * tinggi;
    }
    
    
    
    
}
