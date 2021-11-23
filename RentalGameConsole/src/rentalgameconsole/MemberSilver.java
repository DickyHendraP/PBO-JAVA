/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalgameconsole;

/**
 *
 * @author dickypmngks
 */
public class MemberSilver extends AndOther {
    // Atribut
    protected int biayaRental, poin, diskon, biayaTemp, jumlahDiskon, biayaTotal;
    
    
    // Konstruktor
    MemberSilver() {
        this.biayaRental = 25000;
        this.poin = 1;
        this.diskon = 1;
    }
    
    protected int jumlahBiaya(int durasiRental) {
        
        biayaTemp = durasiRental * biayaRental;
        jumlahDiskon = (biayaTemp * diskon) / 100;
        biayaTotal = biayaTemp - jumlahDiskon;
        
        return biayaTotal;
    }
    
    protected int dapatPoin(int durasiRental) {
        
        int totalPoin = durasiRental * poin;
        return totalPoin;
    }
    
}
