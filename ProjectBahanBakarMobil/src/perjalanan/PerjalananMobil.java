/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perjalanan;

import jenismobil.*;

/**
 *
 * @author dickypmngks
 */
public class PerjalananMobil {
    
    public static void main(String [] args){
        
        MobilSedan ms = new MobilSedan();
        MobilSUV msuv = new MobilSUV();
        MobilMPV mmpv = new MobilMPV();
        
        String[][] jenisDataMobil = {
            {"A", "Sedan", "107", "60"},
            {"B", "Sedan", "538", "65"},
            {"c", "SUV", "662", "57"},
            {"D", "SUV", "471", "62"},
            {"E", "MPV", "541", "64"},
            {"F", "MPV", "443", "53"},
        };
        
        for(int x=0; x <= jenisDataMobil.length - 1; x++){
            if(jenisDataMobil[x][1] == "Sedan"){
                ms.jarakMobil = Double.parseDouble(jenisDataMobil[x][2]);
                ms.cepatMobil = Double.parseDouble(jenisDataMobil[x][3]);
                
                System.out.println("Mobil " + jenisDataMobil[x][0]);
                
                ms.MinBBM();
                ms.LamaTempuh();
                ms.Hasil();
            } else if (jenisDataMobil[x][1] == "SUV"){
                msuv.jarakMobil = Double.parseDouble(jenisDataMobil[x][2]);
                msuv.cepatMobil = Double.parseDouble(jenisDataMobil[x][3]);
                
                System.out.println("Mobil " + jenisDataMobil[x][0]);
                
                msuv.MinBBM();
                msuv.LamaTempuh();
                msuv.Hasil();
            } else if (jenisDataMobil[x][1] == "MPV"){
                mmpv.jarakMobil = Double.parseDouble(jenisDataMobil[x][2]);
                mmpv.cepatMobil = Double.parseDouble(jenisDataMobil[x][3]);
                
                System.out.println("Mobil " + jenisDataMobil[x][0]);
                
                mmpv.MinBBM();
                mmpv.LamaTempuh();
                mmpv.Hasil();
            }
        }
    }
}
