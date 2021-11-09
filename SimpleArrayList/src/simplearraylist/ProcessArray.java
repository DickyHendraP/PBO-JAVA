/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.Scanner;
import static java.util.Collections.binarySearch;
import java.util.ArrayList;

/**
 *
 * @author dickypmngks
 */
public class ProcessArray {
    
    ArrayList<String> dataUser  = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    void tambahData(){
        System.out.println("Masukkan data string : ");
        dataUser.add(input.nextLine());
        System.out.println("Daftar string dalam array list : " + dataUser);
        input.nextLine();
    }
    
    void cariData(){
        System.out.println("String yang mau dicari : ");
        String search = input.nextLine();
        int result = dataUser.indexOf(search);
        
        if(result > -1){
            System.out.println("String " + search + " ada di index ke-" + result + " di dalam data");
        } else {
            System.out.println("String " + search + "tidak ada dalam data");
        }
    }
    
    void hapusData(){
        System.out.println("String yang mau dihapus ");
        String delete = input.nextLine();
        
        if(binarySearch(dataUser, delete) > -1){
            dataUser.remove(binarySearch(dataUser, delete));
            System.out.println("String " + delete + " sudah di hapus di dalam data ");
        } else {
            System.out.println("String " + delete + " tidak ada dalam data ");
        }
    }
    
    void showData(){
        System.out.println("Daftar string dalam array list : " + dataUser);
    }
}
