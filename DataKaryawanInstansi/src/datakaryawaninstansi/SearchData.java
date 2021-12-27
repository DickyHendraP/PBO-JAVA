/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawaninstansi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dickypmngks
 */
public class SearchData extends MenuData implements Others {
    
    int pilih = memilih;
    Scanner input = new Scanner(System.in);
    
    int index = 0;
    
    int umr, stts, jmlhAnk, gapok, tunjMnkh, tunjPgw, tunjAnk, gajiKtr;
    
    double ptgnGaji, gajiBrsh;
    
    String menikah, golongan;
    
    ArrayList<ArrayList<String>> dataKaryawan = new ArrayList<>();
    
    boolean ditemukan = false;

    @Override
    public int crData(ArrayList<ArrayList<String>> dataKaryawan) {
        System.out.print("Masukkan kode karyawan : ");
        String kodeKaryawan = input.nextLine();
        
        for(int i = 0; i < dataKaryawan.size(); i++) {
            String dataKodeKaryawan = dataKaryawan.get(i).get(0);
            
            if(dataKodeKaryawan.equals(kodeKaryawan)){
                ditemukan = true;
                index = i;
            } else {
                ditemukan = false;
            }
        }
        return index;
    }

    @Override
    public int htngUmr(ArrayList<ArrayList<String>> dataKaryawan) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date = formatter.parse(dataKaryawan.get(index).get(3));
            LocalDate tanggal = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            Period period = Period.between(tanggal, LocalDate.now());
            umr = period.getYears();
        } catch (ParseException ex) {
            Logger.getLogger(SearchData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return umr;
    }

    @Override
    public void htngGaji() {

        switch(golongan) {
            case "A" :
                gapok = 5000000;
                break;
                
            case "B" :
                gapok = 6000000;
                break;
            
            case "C" :
                gapok = 7000000;
                break;
        }
        
        if(stts == 0) {
            tunjMnkh = (gapok * 10) / 100;
        } else {
            tunjMnkh = 0;
        }
        
        if(umr > 30) {
            tunjPgw = (gapok * 15) / 100;
        } else {
            tunjPgw = 0;
        }
        
        if(jmlhAnk > 0) {
            tunjAnk = (gapok * 5 / 100) * jmlhAnk;
        } else {
            tunjAnk = 0;
        }
        
        gajiKtr = gapok + tunjMnkh + tunjPgw + tunjAnk;
        
        ptgnGaji = (gapok * 2.5) / 100;
        
        gajiBrsh = gajiKtr - ptgnGaji;
    }
    
    public void tmplData(ArrayList<ArrayList<String>> dataKaryawan, int index) {
                
        System.out.println(dataKaryawan.get(index).get(0));
        String kodeKaryawan = dataKaryawan.get(index).get(0);
        String namaKaryawan = dataKaryawan.get(index).get(1);
        golongan = dataKaryawan.get(index).get(4);
        
        stts = Integer.parseInt(dataKaryawan.get(index).get(5));
        
        if(stts == 1) {
            jmlhAnk = Integer.parseInt(dataKaryawan.get(index).get(6));
            menikah = "Sudah Menikah";
        } else {
            jmlhAnk = 0;
            menikah = "Belum Menikah";
        }
        
        htngGaji();
        int umur = htngUmr(dataKaryawan);
        
        System.out.println("\n===============================================");
        System.out.println("             DATA PROFILE KARYAWAN             ");
        System.out.println("-----------------------------------------------");
        System.out.println("Kode Karyawan           : " + kodeKaryawan);
        System.out.println("Nama Karyawan           : " + namaKaryawan);
        System.out.println("Golongan                : " + this.golongan);
        System.out.println("Usia                    : " + umur);
        System.out.println("Status Menikah          : " + this.menikah);
        System.out.println("\n");
        System.out.println("Jumlah Anak             : " + this.jmlhAnk);
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Gaji Pokok              : Rp. " + this.gapok);
        System.out.println("Tunjangan Istri/Suami   : Rp. " + this.tunjMnkh);
        System.out.println("Tunjangan Pegawai       : Rp. " + this.tunjPgw);
        System.out.println("Tunjangan Anak          : Rp. " + this.tunjAnk);
        
        System.out.println("----------------------------------------------- +");
        
        System.out.println("Gaji Kotor              : Rp. " + this.gajiKtr);
        System.out.println("Potongan                : Rp. " + this.ptgnGaji);
        
        System.out.println("----------------------------------------------- -");
        
        System.out.println("Gaji Bersih             : Rp. " + this.gajiBrsh);
    }

    @Override
    void mnSkndr() {
        System.out.println("\n1. Kembali ke Menu Utama");
    }
    
    @Override
    public int pilihMnSkndr() {
        System.out.print("Menu Pilihan : ");
        pilih = Integer.parseInt(input.nextLine());
        return pilih;
    }
}
