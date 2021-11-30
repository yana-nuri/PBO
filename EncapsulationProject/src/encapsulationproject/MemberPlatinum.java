/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationproject;

/**
 *
 * @author Acer
 */
public class MemberPlatinum extends MemberGold{
    private int bonus;
    
    
    MemberPlatinum() {
        setBiayaRental(45000);
        setPoin(10);
        setDiskon(3);
        setuangKembali(10000);
    }
    
    protected int dapatBonus(int durasiRental) {
        
        bonus = durasiRental * 5000;
        return bonus;
    }
}

