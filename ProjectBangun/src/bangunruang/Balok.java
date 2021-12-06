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
public class Balok extends BangunRuang {
    
    public double p, l, t;
    
    public double hitungVolume() {
        double volume = p * l * t;
        return volume;
    }

    public double hitungPermukaanLuas() {
        double PLuas = 2 * ((p * l) * (l * t) * (t * p));
        return PLuas;
    }
    
}
