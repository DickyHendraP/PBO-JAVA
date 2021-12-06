/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenismobil;

/**
 *
 * @author dickypmngks
 */
public abstract class Mobil {
    
    public abstract double MinBBM();
    public abstract double LamaTempuh();
    public void Hasil(){
        System.out.println("Bahan Bakar yang diperlukan diperkirakan : " + this.MinBBM());
        System.out.println("Lama Perjalanan yang diperlukan diperkirakan : " + this.LamaTempuh());
    }
}
