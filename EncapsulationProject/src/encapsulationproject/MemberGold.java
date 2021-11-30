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
public class MemberGold extends MemberSilver{
    private int uangKembali;
    
    public void setuangKembali(int UK){
        this.uangKembali = UK;
    }
    
    MemberGold() {
        setBiayaRental(30000);
        setPoin(5);
        setDiskon(2);
        setuangKembali(5000);
    }
    
    public int getuangKembali(){
        return this.uangKembali;
    }
}
