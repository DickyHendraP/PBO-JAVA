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
public class Persegi {
    //atribut
    public String namaPersegi;
    public int sisi;
  
    //method
    public void hitungLuasPersegi(){
        int hasil = sisi * sisi;
        System.out.println("Luas Persegi " + namaPersegi + " adalah : " + hasil);
    }
    
    public void hitungKelilingPersegi(){
        int hasil = 4 * sisi;
        System.out.println("Keliling Persegi " + namaPersegi + " adalah : " + hasil);
    }
}
