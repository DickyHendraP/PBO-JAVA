/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawaninstansi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dickypmngks
 */
public class DelData extends MenuData{
    int pilih = memilih;
    Scanner input = new Scanner(System.in);
    
    public void hpsData(ArrayList<ArrayList<String>> dataKaryawan) {
        
        System.out.print("Kode Karyawan yang mau dihapus     : ");
        String kdKary = input.nextLine();
        
        boolean ditemukan = false;
        int index = 0;
        
        for(int i = 0; i < dataKaryawan.size(); i++) {
            String data = dataKaryawan.get(i).get(0);
            if(data.equals(kdKary)){
                ditemukan = true;
                index = i;
            }
        }   
        
        if(ditemukan != true) {
            System.out.println("Data Karyawan tidak ditemukan");
        } else {
            dataKaryawan.remove(index);
            System.out.println("Data Karyawan " + kdKary + " berhasil dihapus");
        }    
    }

    @Override
    void mnSkndr() {
        System.out.println("\n1. Kembali ke Menu Utama");
        System.out.println("2. Hapus Data Kembali");
    }
    
    @Override
    public int pilihMnSkndr() {
        System.out.print("Menu Pilihan                          : ");
        pilih = Integer.parseInt(input.nextLine());
        
        return pilih;
    }
}
