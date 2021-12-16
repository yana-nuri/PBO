/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author Acer
 */
public class Sedan extends Mobil {
    public double kecepatan, jarak;
    public double PerhitunganBBM() {    
        double BBM = jarak / 10;
        return BBM;
    }

    public double hitungLamaPerjalanan() {
        double durasi = jarak / kecepatan;
        return durasi;
    }  
}
