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
    private int hargaRental, poin, diskon, hargaTemp, jumlahDiskon, totalHarga;
    
    public void setBiayaRental(int br){
        this.hargaRental = br;
    }
    
    public void setPoin(int pn){
        this.poin = pn;
    }
    
    public void setDiskon(int ds){
        this.diskon = ds;
    }

    MemberSilver() {
        setBiayaRental(25000);
        setPoin(1);
        setDiskon(1);
    }
    
    protected int jumlahBiaya(int durasiRental) {
        
        hargaTemp = durasiRental * hargaRental;
        jumlahDiskon = (hargaTemp * diskon) / 100;
        totalHarga = hargaTemp - jumlahDiskon;
        
        return totalHarga;
    }
    
    protected int dapatPoin(int durasiRental) {
        
        int totalPoin = durasiRental * poin;
        return totalPoin;
    }
    
}
