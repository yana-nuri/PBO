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
public class MemberSilver extends Others{
    // Atribut
    private int biayaRental, poin, diskon, biayaTemp, jumlahDiskon, biayaTotal;
    
    public void setBiayaRental(int br){
        this.biayaRental = br;
    }
    
    public void setPoin(int pn){
        this.poin = pn;
    }
    
    public void setDiskon(int ds){
        this.diskon = ds;
    }
    
    // Konstruktor
    MemberSilver() {
        setBiayaRental(25000);
        setPoin(1);
        setDiskon(1);
    }
    
    protected int jumlahBiaya(int durasiRental) {
        
        biayaTemp = durasiRental * biayaRental;
        jumlahDiskon = (biayaTemp * diskon) / 100;
        biayaTotal = biayaTemp - jumlahDiskon;
        
        return biayaTotal;
    }
    
    protected int dapatPoin(int durasiRental) {
        
        int totalPoin = durasiRental * poin;
        return totalPoin;
    }
    
}
