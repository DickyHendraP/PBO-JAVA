/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author dickypmngks
 */
public class Segitiga {
    
    static double sisiMiring(double a, double b){
        return (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
    
    double hitungLuasSegitiga(int alas, int tinggi){
        return ((alas * tinggi) / 2);
    }
    
    double hitungLuasSegitiga(int alas, double tinggi){
        return ((alas * tinggi) / 2);
    }
    
    double hitungLuasSegitiga(double alas, int tinggi){
        return ((alas * tinggi) / 2);
    }
    
    double hitungLuasSegitiga(double alas, double tinggi){
        return ((alas * tinggi) / 2);
    }
    
    //Hitung Keliling Segitiga sama kaki
    double hitungKelilingSegitiga(int alas, int tinggi){
        double SisiMiring = sisiMiring(alas, tinggi);
        return (alas + tinggi + SisiMiring);
    }
    
    double hitungKelilingSegitiga(int alas, double tinggi){
        double SisiMiring = sisiMiring(alas, tinggi);
        return (alas + tinggi + SisiMiring);
    }
    
    double hitungKelilingSegitiga(double alas, int tinggi){
        double SisiMiring = sisiMiring(alas, tinggi);
        return (alas + tinggi + SisiMiring);
    }
    
    double hitungKelilingSegitiga(double alas, double tinggi){
        double SisiMiring = sisiMiring(alas, tinggi);
        return (alas + tinggi + SisiMiring);
    }
}
