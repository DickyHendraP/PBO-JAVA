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
public abstract class BangunRuang {
    
    public abstract double hitungVolume();
    public abstract double hitungPermukaanLuas();
    public void tampilHasil(){
        System.out.println("Volumenya      : " + this.hitungVolume());
        System.out.println("Luas Permukaan : " + this.hitungPermukaanLuas());
    }
}
