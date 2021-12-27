/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawaninstansi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author dickypmngks
 */
public class AddData extends MenuData {
    
    String kdKary, nmKary, almt, tglLhr, golongan, jmlhAnk, stts;
    int pilih = memilih;
    
    Scanner input = new Scanner(System.in);
    ArrayList<ArrayList<String>> dataKaryawan = new ArrayList<>();

    
    public void tmbhknData(ArrayList<ArrayList<String>> dataKaryawan) {
        
        System.out.print("\nMasukkan Kode Karyawan       : ");
        kdKary = input.nextLine();
        
        System.out.print("Masukkan Nama Karyawan       : ");
        nmKary = input.nextLine();
        
        System.out.print("Masukkan Alamat              : ");
        almt = input.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir       : ");
        tglLhr = input.nextLine();
        
        System.out.print("Masukkan Golongan (A, B, C)  : ");
        golongan = input.nextLine();
        switch(golongan) {
            case "A" :
                break;
            case "B" :
                break;
            case "C" :
                break;
            default :
                System.out.println("\nStatus Menikah Tidak Valid, Silakan Ulangi dari Awal");
                tmbhknData(dataKaryawan);
        }
        
        System.out.print("Masukkan Status Menikah ( 0 jika belum, 1 jika sudah) : ");
        stts = input.nextLine();
        if(Integer.parseInt(stts) == 0) {
            dataKaryawan.add(new ArrayList<String>(
                Arrays.asList(kdKary, nmKary, almt, tglLhr, golongan, stts)
            ));
        } else if(Integer.parseInt(stts) == 1) {
            System.out.print("Masukkan Jumlah Anak         : ");
            jmlhAnk = input.nextLine();
            
            dataKaryawan.add(new ArrayList<String>(
                Arrays.asList(kdKary, nmKary, almt, tglLhr, golongan, stts, jmlhAnk)
            ));
        } else {
            System.out.println("\nStatus Menikah Tidak Valid, Silakan Ulangi dari Awal");
            tmbhknData(dataKaryawan);
        }
    }
    
    @Override
    void mnSkndr() {
        System.out.println("\n1. Kembali ke Menu Utama");
        System.out.println("2. Tambah Data Kembali");
    }

    @Override
    public int pilihMnSkndr() {
        System.out.print("Menu Pilihan : ");
        pilih = Integer.parseInt(input.nextLine());
        return pilih;
    }
}
