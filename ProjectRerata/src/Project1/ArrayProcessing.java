/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.util.Scanner;
/**
 *
 * @author dickypmngks
 */



public class ArrayProcessing {
    int [] bilData = new int[100];
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Banyak nya data (n) : ");
        this.n = input.nextInt();
            for(int x=0; x<this.n; x++){
                System.out.println("Masukkan Bil ke -" + (x+1) + " : ");
                this.bilData[x] = input.nextInt();
            }
    }
    
    double hitungRerata(int[]data){
        double sum = 0;
        for(int x=0; x<this.n; x++){
            sum += data[x];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    int cariMax(int[]data){
        int max = data[0];
        for(int x=0; x<this.n; x++){
            if(data[x]>max){
                max = data[x];
            }
        }
        return max;
    }
    
    int cariMin(int[]data){
        int min = data[0];
        for(int x=0; x<this.n; x++){
            if(data[x]<min) {
                min = data[x];
            }
        }
        return min;
    }
    
    
    void output(){
        System.out.println("\n###Hasil###");
        System.out.println("Nilai Rata-rata : " + hitungRerata(this.bilData));
        System.out.println("Nilai Maximum   : " + cariMax(this.bilData));
        System.out.println("Nilai Minimum   : " + cariMin(this.bilData));
    }
}
