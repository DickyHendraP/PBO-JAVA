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
public class MobilSedan extends Mobil {

    public double cepatMobil, jarakMobil;
    
    public double MinBBM(){
        double minBBM = jarakMobil / 10;
        return minBBM;
    }
    
    public double LamaTempuh(){
        double LTempuh = jarakMobil / cepatMobil;
        return LTempuh;
    }
}
