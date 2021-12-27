/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawaninstansi;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author dickypmngks
 */
public class MainClass extends MenuData {
    /**
     * @param args the command line arguments
     */
    Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) throws ParseException {
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<ArrayList<String> > dataKrywn = new ArrayList<>();

        AddData add = new AddData();
        ShowData Show = new ShowData();
        DelData Del = new DelData();
        SearchData Search = new SearchData();
        
        while( true ){    
            add.mnUtm();
            System.out.print("Menu pilihan                  : ");
            int memilih = input.nextInt();
            
            switch(memilih){
                case 1 : 
                    boolean loop = true;
                    while( loop ){
                        System.out.println("");
                        System.out.println("============================================================");
                        System.out.println("                      Menu Tambah Data                      ");
                        System.out.println("------------------------------------------------------------");                        
                        
                        add.tmbhknData(dataKrywn);
                        
                        
                        System.out.println("\n");
                        System.out.println("Pilih Submenu   : ");
                        add.mnSkndr();
                        
                        System.out.println("");
                        add.pilihMnSkndr();
                        
                        if( add.pilih == 1 ){
                            loop = false;
                        }else if(add.pilih != 2) {
                            System.out.println("pilihan sub menu tidak ada");
                        }  
                    }
                    break;
                
                    
                case 2 : 
                    loop = true;
                    while( loop ) {
                        System.out.println("");
                        System.out.println("============================================================");
                        System.out.println("                         Hapus Data                         ");
                        System.out.println("------------------------------------------------------------");
                        String cb = input.nextLine();
                       
                        Del.hpsData(dataKrywn);

                        //input submenu
                        System.out.println("Pilih Submenu   : ");
                        Del.mnSkndr();
                        System.out.println("");
                        Del.pilihMnSkndr();
                        
                        if( Del.pilih == 1 ){
                            loop = false;
                        } else if(Del.pilih != 2) {
                            System.out.println("pilihan sub menu tidak ada");
                        }
                        
                    }
                    break;
                
                case 3 :                     
                    loop = true;
                    while( loop ){
                        System.out.println("");
                        System.out.println("============================================================");
                        System.out.println("                         Cari Data                          ");
                        System.out.println("------------------------------------------------------------");
                        
                        int i = Search.crData(dataKrywn);
                        Search.tmplData(dataKrywn, 0);

                        //input submenu
                        System.out.println("");
                        System.out.println("Pilih SubMenu   : ");
                        Search.mnSkndr();
                        
                        System.out.println("");
                        Search.pilihMnSkndr();
                        
                        if( Search.pilih == 1 ){
                            loop = false;
                        } else{
                            System.out.println("pilihan sub menu tidak ada");
                        }
                    }
                    break;
                
                case 4 : 
                    loop = true;
                    while( loop ){

                        Show.lhtData(dataKrywn);
   
                        System.out.println("\n");
                        System.out.println("Pilih Submenu    : ");
                        Show.mnSkndr();
                        
                        System.out.println("");
                        Show.pilihMnSkndr();
                        
                        if( Show.pilih == 1 ){
                            loop = false;
                        }else{
                            System.out.println("pilihan sub menu tidak ada");
                        }
                    }
                    break;

                    
                case 5 : 
                    System.exit(0);
                
                default: 
                    System.out.println("Menu yang anda pilih tidak ada dalam daftar");
                    System.out.println("");
                
            }   
            
        }
    }

    @Override
    public int pilihMnSkndr() {
        System.out.print("Menu Pilihan                          : ");
        int pilih = Integer.parseInt(input.nextLine());
        
        return pilih;
    }

    @Override
    void mnSkndr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
