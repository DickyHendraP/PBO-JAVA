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
public class PersegiPanjang extends BangunDatar {
    // atribut jari-jari
    public double panjangPersegi, lebarPersegi;
     
    // method untuk hitung luas lingkaran
    public double hitungLuas(){
        double luasPP = panjangPersegi * lebarPersegi;
        return luasPP;
    }
    
    // method untuk hitung keliling
    public double hitungKeliling(){
 	  double kelilingPP = 2 * (panjangPersegi * lebarPersegi);
          return kelilingPP;
    }
}
