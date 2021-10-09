/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author dickypmngks
 */
public class ProjectMethod2 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        // TODO code application logic here
        double besarLingkaran = Lingkaran.hitungLuas(14)/2;
        double kecilLingkaran = Lingkaran.hitungLuas(7);
        double luasDiarsir = besarLingkaran - kecilLingkaran;
        
        System.out.println("Luas yang Diarsir adalah : " + luasDiarsir);
    }    
}
