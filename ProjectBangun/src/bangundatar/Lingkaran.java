/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author dickypmngks
 */
public class Lingkaran extends BangunDatar {
    // atribut jari-jari
    public double jari2;
     
    // method untuk hitung luas lingkaran
    public double hitungLuas(){
        double luas = Math.PI * jari2 * jari2;
        return luas;
    }
    
    // method untuk hitung keliling
    public double hitungKeliling(){
 	  double keliling = 2 * Math.PI * jari2;
          return keliling;
    }
}
