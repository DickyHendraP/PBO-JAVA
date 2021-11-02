/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

/**
 *
 * @author dickypmngks
 */
import java.util.Scanner;
public class GameTebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nilaiAngkaAwal = 0 + (int)(Math.random() * 100);
        System.out.println("Hai...Nama saya Mr.Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        
        for (int x=0;x<=100;x++){
            System.out.println("Masukkan Tebakan Anda : ");
            int tebakan = input.nextInt();
            
            if (tebakan < nilaiAngkaAwal){
                System.out.println("Hehehe..Bilangan tebakan anda terlalu kecil");
            }else if (tebakan > nilaiAngkaAwal){
                System.out.println("Hehehe...Bilangan tebakan anda terlalu besar");
            }else{
                System.out.println("Yeee...Bilangan tebakan anda BENAR :-)");
                break;
            }
        }
    }
    
}
