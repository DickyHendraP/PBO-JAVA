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
public class Bola extends BangunRuang {

    public double jari2;
    
    public double hitungVolume() {
        double volume = (4/3) * 3.14 * Math.pow(jari2, 3);
        return volume;
    }

    
    public double hitungPermukaanLuas() {
        double PLuas = 4 * Math.PI * Math.pow(jari2, 2);
        return PLuas;
    }
    
}
