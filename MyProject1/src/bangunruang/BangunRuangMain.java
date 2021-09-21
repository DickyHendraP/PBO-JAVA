/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author dickypmngks
 */
public class BangunRuangMain {
    public static void main(String[] args){
        bola Bola = new bola();
        Bola.jari2 = 10;
        Bola.hitungVolumeBola();
        Bola.hitungSelimutBola();
        
        System.out.println("");
        System.out.println("*******************TABUNG**************");
        
        Tabung tabung = new Tabung();
        tabung.jari2 = 20;
        tabung.tinggi = 10;
        tabung.hitungVolumeTabung();
        tabung.hitungSelimutTabung();
        
        System.out.println("");
        System.out.println("*******************KERUCUT*************");
        
        Kerucut kerucut = new Kerucut();
        kerucut.jari2 = 10;
        kerucut.sisi = 30;
        kerucut.tinggi = 20;
        kerucut.hitungVolumeKerucut();
        kerucut.hitungSelimutKerucut();
    }
}
