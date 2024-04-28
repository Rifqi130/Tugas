/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometribangundatar;

import coba3.Bangundatar;

import javax.swing.JTextField;


public class Lingkaran implements Bangundatar{
    
    protected double jari_jari;

    public Lingkaran(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }
    
    public Lingkaran(JTextField sisi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    @Override
    public double Luas() {
        return Math.PI * Math.pow(jari_jari, 2);
    }
    
}
