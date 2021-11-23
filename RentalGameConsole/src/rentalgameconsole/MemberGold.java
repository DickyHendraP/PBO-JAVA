/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalgameconsole;

/**
 *
 * @author dickypmngks
 */
public class MemberGold extends MemberSilver{
    int uangKembali;
    
    MemberGold() {
        biayaRental = 30000;
        poin = 5;
        diskon = 2;
        uangKembali = 5000;
    }
}
