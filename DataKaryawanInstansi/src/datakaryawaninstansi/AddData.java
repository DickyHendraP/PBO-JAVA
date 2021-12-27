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
    String kodeKaryawan, namaKaryawan, alamat, tglLahir, golongan, jmlAnak, status;
    int pilih = memilih;
    
    Scanner input = new Scanner(System.in);
    ArrayList<ArrayList<String>> dataKaryawan = new ArrayList<>();

    
    public void tambahData(ArrayList<ArrayList<String>> dataKaryawan) {
        
        //input data
        System.out.print("\nMasukkan Kode Karyawan : ");
        kodeKaryawan = input.nextLine();
        
        System.out.print("Masukkan Nama Karyawan : ");
        namaKaryawan = input.nextLine();
        
        System.out.print("Masukkan Alamat : ");
        alamat = input.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir : ");
        tglLahir = input.nextLine();
        
        System.out.print("Masukkan Golongan (A, B, C) : ");
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
                tambahData(dataKaryawan);
        }
        
        System.out.print("Masukkan Status Menikah ( 0 jika belum, 1 jika sudah) : ");
        status = input.nextLine();
        if(Integer.parseInt(status) == 0) {
            dataKaryawan.add(new ArrayList<String>(
                Arrays.asList(kodeKaryawan, namaKaryawan, alamat, tglLahir, golongan, "Belum Menikah")
            ));
        } else if(Integer.parseInt(status) == 1) {
            System.out.print("Masukkan Jumlah Anak : ");
            jmlAnak = input.nextLine();
            
            dataKaryawan.add(new ArrayList<String>(
                Arrays.asList(kodeKaryawan, namaKaryawan, alamat, tglLahir, golongan, "Sudah Menikah", jmlAnak)
            ));
        } else {
            System.out.println("\nStatus Menikah Tidak Valid, Silakan Ulangi dari Awal");
            tambahData(dataKaryawan);
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
