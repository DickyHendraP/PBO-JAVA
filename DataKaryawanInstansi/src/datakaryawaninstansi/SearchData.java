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

/**
 *
 * @author dickypmngks
 */
public class SearchData extends MenuData implements Others {
    
    int pilih = memilih;
    Scanner input = new Scanner(System.in);
    
    int index = 0;
    
    int jmlhAnk, gapok, tunjMnkh, tunjPgw, tunjAnk, gajiKtr;
    double ptgnGaji, gajiBrsh;
    String stts;
    
    public boolean cariData(ArrayList<ArrayList<String>> dataKaryawan) throws ParseException {
        System.out.print("Masukkan kode karyawan : ");
        String kodeKaryawan = input.nextLine();
        
        for(int i = 0; i < dataKaryawan.size(); i++) {
            String dataKodeKaryawan = dataKaryawan.get(i).get(0);
            
            if(dataKodeKaryawan.equals(kodeKaryawan)){
                boolean ditemukan = true;
                index = i;
            } else {
                boolean ditemukan = false;
            }
        }
        return ditemukan;
    }
    
    public void gaji() {
        
        //gaji pokok
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
        
        //tunjangan menikah
        if(stts == "Sudah Menikah") {
            tunjMnkh = (gapok * 10) / 100;
        } else {
            tunjMnkh = 0;
        }
        
        //tunjangan pegawai
        if(umr > 30) {
            tunjPgw = (gapok * 15) / 100;
        } else {
            tunjPgw = 0;
        }
        
        //tunjangan anak
        if(jmlhAnk > 0) {
            tunjAnk = (gapok * 5 / 100) * jmlhAnk;
        } else {
            tunjAnk = 0;
        }
        
        //gaji kotor
        gapok = gapok + tunjMnkh + tunjPgw + tunjAnk;
        
        //potongan
        ptgnGaji = (gapok * 2.5) / 100;
        
        //gaji bersih
        gajiBrsh = gajiKtr - ptgnGaji;
    }
    
    public void showData(ArrayList<ArrayList<String>> dataKaryawan, int index) throws ParseException {
        
        String kodeKaryawan = dataKaryawan.get(index).get(0);
        String namaKaryawan = dataKaryawan.get(index).get(1);
        golongan = dataKaryawan.get(index).get(4);
        
        // mencari usia
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(dataKaryawan.get(index).get(3));
        LocalDate birthDay = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        Period period = Period.between(birthDay, LocalDate.now());
        umr = period.getYears();
        
        stts = dataKaryawan.get(index).get(5);
        
        if(stts == "Sudah Menikah") {
            jmlhAnk = Integer.parseInt(dataKaryawan.get(index).get(6));
        } else {
            jmlhAnk = 0;
        }
        
        //hitung gaji
        gaji();
        
        //tampilkan semua
        System.out.println("\n================================");
        System.out.println("    DATA PROFILE KARYAWAN");
        System.out.println("--------------------------------");
        System.out.println("Kode Karyawan : " + kodeKaryawan);
        System.out.println("Nama Karyawan : " + namaKaryawan);
        System.out.println("Golongan : " + golongan);
        System.out.println("Usia : " + umr);
        System.out.println("Status Menikah : " + stts);
        System.out.println("Jumlah Anak : " + jmlhAnk);
        
        System.out.println("-------------------------------");
        
        System.out.println("Gaji Pokok : Rp. " + gapok);
        System.out.println("Tunjangan Istri/Suami : Rp. " + tunjMnkh);
        System.out.println("Tunjangan Pegawai : Rp. " + tunjPgw);
        System.out.println("Tunjangan Anak : Rp. " + tunjAnk);
        
        System.out.println("-------------------------------");
        
        System.out.println("Gaji Kotor : Rp. " + gapok);
        System.out.println("Potongan : Rp. " + ptgnGaji);
        
        System.out.println("-------------------------------");
        
        System.out.println("Gaji Bersih : Rp. " + gajiBrsh);
    }

    @Override
    public int pilihMnSkndr() {
        System.out.print("Menu Pilihan : ");
        pilih = Integer.parseInt(input.nextLine());
        return pilih;
    }

    @Override
    void mnSkndr() {
        System.out.println("\n1. Kembali ke Menu Utama");
        System.out.println("2. Tambah Data Kembali");
    }

    @Override
    public int crData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int htngUmr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void htngGaji() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void tmplData() {
        
    }
}
