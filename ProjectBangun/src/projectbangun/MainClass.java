/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;
import bangundatar.*;
import bangunruang.*;
/**
 *
 * @author dickypmngks
 */
public class MainClass {
    public static void main(String[] args) {
        
        Persegi persegi = new Persegi();
        PersegiPanjang ppanjang = new PersegiPanjang();
        Lingkaran lingkaran = new Lingkaran();
        
        Tabung tabung = new Tabung();
        Balok balok = new Balok();
        Bola bola = new Bola();
        
        //Persegi
        persegi.sisi = 10;
        System.out.println("Persegi dengan panjang sisi " + persegi.sisi);
        persegi.hitungLuas();
        persegi.hitungKeliling();
        persegi.tampilHasil();

         //Persegi Panjang
        ppanjang.panjangPersegi = 10;
        ppanjang.lebarPersegi = 15;
        System.out.println("\nPersegi panjang dengan panjang " + ppanjang.panjangPersegi + " dan lebar " + ppanjang.lebarPersegi);
        ppanjang.hitungLuas();
        ppanjang.hitungKeliling();
        ppanjang.tampilHasil();
        
        //Lingkaran
        lingkaran.jari2 = 15;
        System.out.println("\nLingkgaran dengan jari - jari " + lingkaran.jari2);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        lingkaran.tampilHasil();
        
        //Balok
        balok.p = 2;
        balok.l = 4;
        balok.t = 6;
        System.out.println("\nBalok dengan panjang " + balok.p + ",lebar " + balok.l + " dan tinggi " + balok.t);
        balok.hitungVolume();
        balok.hitungPermukaanLuas();
        balok.tampilHasil();
        
        //Tabung
        tabung.jari2 = 20;
        tabung.t = 20;
        System.out.println("\nTabung dengan jari - jari " + tabung.jari2 + "dan tinggi" + tabung.t);
        tabung.hitungVolume();
        tabung.hitungPermukaanLuas();
        tabung.tampilHasil();
        
        //Bola
        bola.jari2 = 15;
        System.out.println("\nBola dengan jari - jari " + bola.jari2);
        bola.hitungVolume();
        bola.hitungPermukaanLuas();
        bola.tampilHasil();           
    }
}
