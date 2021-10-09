/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author dickypmngks
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang PPanjang = new PersegiPanjang();
        System.out.println("Luas Persegi Panjang dengan panjang 10 dan lebar 5 adalah = " + PPanjang.hitungLuasPPanjang(10, 5));
        System.out.println("Luas Persegi Panjang dengan panjang 3.6 dan lebar 8 adalah = " + PPanjang.hitungLuasPPanjang(3.6, 8));
        System.out.println("Luas Persegi Panjang dengan panjang 6 dan lebar 8.3 adalah = " + PPanjang.hitungLuasPPanjang(6, 8.3));
        System.out.println("Luas Persegi Panjang dengan panjang 5.6 dan lebar 8.8 adalah = " + PPanjang.hitungLuasPPanjang(5.6, 8.8));
        
        System.out.println("\n");
        System.out.println("Keliling Persegi Panjang dengan panjang 10 dan lebar 5 adalah = " + PPanjang.hitungKelilingPPanjang(10, 5));
        System.out.println("Keliling Persegi Panjang dengan panjang 3.6 dan lebar 8 adalah = " + PPanjang.hitungKelilingPPanjang(3.6, 8));
        System.out.println("Keliling Persegi Panjang dengan panjang 6 dan lebar 8.3 adalah = " + PPanjang.hitungKelilingPPanjang(6, 8.3));
        System.out.println("Keliling Persegi Panjang dengan panjang 5.6 dan lebar 8.8 adalah = " + PPanjang.hitungKelilingPPanjang(5.6, 8.8));
        
        System.out.println("\n");
        Persegi persegi = new Persegi();
        System.out.println("Luas Persegi dengan panjang sisi 4.5 adalah = " + persegi.hitungLuasPersegi(4.5));
        System.out.println("Luas Persegi dengan panjang sisi 7 adalah = " + persegi.hitungLuasPersegi(7));
        
        System.out.println("\n");
        System.out.println("Keliling Persegi dengan panjang sisi 4.5 adalah = " + persegi.hitungKelilingPersegi(4.5));
        System.out.println("Keliling Persegi dengan panjang sisi 7 adalah = " + persegi.hitungKelilingPersegi(7));
        
        System.out.println("\n");
        Lingkaran lingkaran = new Lingkaran ();
        System.out.println("Luas Lingkaran dengan panjang jari-jari 5 adalah = " + lingkaran.hitungLuasLingkaran(5));
        System.out.println("Luas Lingkaran dengan panjang jari-jari 7.4 adalah = " + lingkaran.hitungLuasLingkaran(7.4));
        
        System.out.println("\n");
        System.out.println("keliling Lingkaran dengan panjang jari-jari 5 adalah = " + lingkaran.hitungKelilingLingkaran(5));
        System.out.println("keliling Lingkaran dengan panjang jari-jari 7.4 adalah = " + lingkaran.hitungKelilingLingkaran(7.4));
        
        System.out.println("\n");
        Segitiga segitiga = new Segitiga ();
        System.out.println("Luas Segitiga dengan Panjang alas 8 dan tinggi 10 adalah = " + segitiga.hitungLuasSegitiga(8, 10));
        System.out.println("Luas Segitiga dengan Panjang alas 8 dan tinggi 11.5 adalah = " + segitiga.hitungLuasSegitiga(8, 11.5));
        System.out.println("Luas Segitiga dengan Panjang alas 12.2 dan tinggi 9 adalah = " + segitiga.hitungLuasSegitiga(12.2, 9));
        System.out.println("Luas Segitiga dengan Panjang alas 13.9 dan tinggi 20.7 adalah = " + segitiga.hitungLuasSegitiga(13.9, 20.7));
        
        System.out.println("\n");
        System.out.println("Keliling Segitiga dengan Panjang alas 8 dan tinggi 10 adalah = " + segitiga.hitungKelilingSegitiga(8, 10));
        System.out.println("Keliling Segitiga dengan Panjang alas 8 dan tinggi 11.5 adalah = " + segitiga.hitungKelilingSegitiga(8, 11.5));
        System.out.println("Keliling Segitiga dengan Panjang alas 12.2 dan tinggi 9 adalah = " + segitiga.hitungKelilingSegitiga(12.2, 9));
        System.out.println("Keliling Segitiga dengan Panjang alas 13.9 dan tinggi 20.7 adalah = " + segitiga.hitungKelilingSegitiga(13.9, 20.7));
        System.out.println("\n");
    }
    
}
