/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author dickypmngks
 */
public class Tabung extends BangunRuang {

    public double jari2, t;
    
    public double hitungVolume() {
        double volume = Math.PI * Math.pow(jari2, 2) * t;
        return volume;
        
    }
    
    public double hitungPermukaanLuas() {
        double luas = Math.PI * jari2 * (jari2 * (2 * t));
        return luas;
    }
    
}
