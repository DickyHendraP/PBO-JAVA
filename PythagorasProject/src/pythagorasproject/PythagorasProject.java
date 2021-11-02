/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author dickypmngks
 */
import java.util.Scanner;
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //atribut
        int pilihMenu;
        double sisiMiringSegitiga, sikuSiku;
    
    //objek
        Scanner input = new Scanner(System.in);
        System.out.println("1. Cek Tripe Pythagoras");
        System.out.println("2. Menentukan sisi miring segitiga");
        System.out.println("3. Menentukan sisi siku-siku segitiga");
        System.out.println("4. Exit");
        System.out.println("\n");
        System.out.println("Silahkan untuk memilih menunya : ");
        
        pilihMenu = input.nextInt();
        
    //Pilih Menu
        switch(pilihMenu){
            case(1):
                System.out.println("a: ");
                int aMengecekPythagoras = input.nextInt();
                System.out.println("b: ");
                int bMengecekPythagoras = input.nextInt();
                System.out.println("c: ");
                int cMengecekPythagoras = input.nextInt();
                
                if(Math.pow(aMengecekPythagoras, 2) + Math.pow(bMengecekPythagoras, 2) == Math.pow(cMengecekPythagoras, 2)){
                    System.out.println("Ketiga angka tersebut adalah triple pythagoras");
                } else {
                    System.out.println("Ketiga angka tersebut adalah bukan triple pythagoras");
                }
                break;
            case(2):
                System.out.println("a: ");
                int aSisiMiring = input.nextInt();
                System.out.println("b: ");
                int bSisiMiring = input.nextInt();
                sisiMiringSegitiga = Math.sqrt((Math.pow(aSisiMiring, 2) + (Math.pow(bSisiMiring, 2))));
                System.out.println("sisi miring segitiga tersebut yaitu : " + sisiMiringSegitiga);
                break;   
            case(3):
                System.out.println("a: ");
                int aAlasSegitiga = input.nextInt();
                System.out.println("c: ");
                int cAlasSegitiga = input.nextInt();
                sikuSiku = Math.sqrt((Math.pow(cAlasSegitiga, 2) + (Math.pow(aAlasSegitiga, 2))));
                System.out.println("sisi siku-siku segitiga tersebut yaitu :  " + sikuSiku);
                break;
            case(4):
                System.exit(0);
            default:
                System.out.println("Output yang anda masukkan tidak ada, Maaf :-)");    
        }
    }
}
