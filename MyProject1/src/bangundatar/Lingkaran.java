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
public class Lingkaran {
    //atribut
    public String namaLingkaran;
    public int jari2;
            
    //method
    public void hitungLuasLingkaran(){
        double hasil = 3.14 * jari2 * jari2;
        System.out.println("Luas Lingkaran " + namaLingkaran + " adalah: "+hasil);
    }
    
    public void hitungKelilingLingkaran(){
        double hasil = 3.14 * 2 * jari2;
        System.out.println("Keliling Lingkaran " + namaLingkaran + " adalah: "+ hasil);
    }
}
