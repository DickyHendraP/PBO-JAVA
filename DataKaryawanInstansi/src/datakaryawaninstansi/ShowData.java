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
public class ShowData extends MenuData{
    int pilih = memilih;
    int umr;
    String menikah;
    Scanner input = new Scanner(System.in);

    
    public void lhtData(ArrayList<ArrayList<String>> dataKaryawan) throws ParseException {
        
        int i = 0;
       String leftAlignFormat = "| %-10s | %-30s | %-5s | %-5s | %-15s | %-11s |%n";
        
        System.out.println("\n================================================================================================");
        System.out.println("                                   DATA KARYAWAN");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf(leftAlignFormat, "KODE KARY", "NAMA KARY", "GOLONGAN", "USIA", "STATUS NIKAH", "JUMLAH ANAK");
        
        while(i < dataKaryawan.size()) {
            
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date = formatter.parse(dataKaryawan.get(i).get(3));
            LocalDate tanggal = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            Period period = Period.between(tanggal, LocalDate.now());
            umr = period.getYears();
            
            if(Integer.parseInt(dataKaryawan.get(i).get(5)) == 1) {
                menikah = "Sudah Menikah";
            } else {
                menikah = "Belum Menikah";
            }
            
            if(dataKaryawan.get(i).size() == 7) {
                System.out.format(leftAlignFormat,  
                        dataKaryawan.get(i).get(0),
                        dataKaryawan.get(i).get(1),
                        dataKaryawan.get(i).get(4),
                        umr,
                        menikah,
                        dataKaryawan.get(i).get(6));
                i++;
                
            } else if (dataKaryawan.get(i).size() == 6) {
                System.out.format(leftAlignFormat,  
                            dataKaryawan.get(i).get(0),
                            dataKaryawan.get(i).get(1),
                            dataKaryawan.get(i).get(4),
                            umr,
                            menikah,
                            0);
                i++;
            }
            
        }
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
    }
}
