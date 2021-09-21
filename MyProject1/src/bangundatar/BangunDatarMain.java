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
public class BangunDatarMain {
    public static void main(String[] args){
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 25;
        pp.lebar = 38;
        pp.hitungLuas();
        pp.hitungKeliling();
        
        System.out.println("");
        System.out.println("**********************PERSEGI**************************");
        
        Persegi persegi = new Persegi();
        persegi.namaPersegi = "A";
        persegi.sisi = 10;
        persegi.hitungLuasPersegi();
        persegi.hitungKelilingPersegi();
        
        System.out.println("");
        persegi.namaPersegi = "B";
        persegi.sisi = 15;
        persegi.hitungLuasPersegi();
        persegi.hitungKelilingPersegi();
        
        System.out.println("");
        System.out.println("**********************LINGKARAN***********************");
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.namaLingkaran = "X";
        lingkaran.jari2 = 25;
        lingkaran.hitungLuasLingkaran();
        lingkaran.hitungKelilingLingkaran();
        
        System.out.println("");
        lingkaran.namaLingkaran = "Z";
        lingkaran.jari2 = 37;
        lingkaran.hitungLuasLingkaran();
        lingkaran.hitungKelilingLingkaran();
    }
    
}
