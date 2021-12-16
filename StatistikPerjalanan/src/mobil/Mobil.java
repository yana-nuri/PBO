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
public abstract class Mobil {
    public abstract double PerhitunganBBM();
    public abstract double hitungLamaPerjalanan();
    public void tampilHasil() {
        System.out.println("Perkiraan Bahan Bakar Minimal yang Diperlukan adalah : " + this.PerhitunganBBM());
        System.out.println("Perkiraan Lama Perjalanan yang Akan Ditempuh adalah : " + this.hitungLamaPerjalanan());
    }
}
