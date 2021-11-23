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
public class MemberPlatinum extends MemberGold{
    int bonus;
    
    MemberPlatinum() {
        biayaRental = 45000;
        poin = 10;
        diskon = 3;
        uangKembali = 10000;
    }
    
    protected int dapatBonus(int durasiRental) {
        
        bonus = durasiRental * 5000;
        return bonus;
    }
}
