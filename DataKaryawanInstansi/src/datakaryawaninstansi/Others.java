/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawaninstansi;

import java.util.ArrayList;

/**
 *
 * @author dickypmngks
 */
public interface Others {
    int umr = 30;
    String golongan = "A";
    
    public abstract int crData(ArrayList<ArrayList<String>> dataKaryawan);
    public abstract int htngUmr(ArrayList<ArrayList<String>> dataKaryawan);
    public abstract void htngGaji();
}
