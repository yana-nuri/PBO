/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistikperjalanan;
import mobil.*;
/**
 *
 * @author Acer
 */
public class StatistikPerjalanan {
        public static void main(String [] args) {
        
        Sedan s = new Sedan();
        SUV suv = new SUV();
        MPV mpv = new MPV();
        
        String[][] dataMobil = {
            {"A", "Sedan", "107", "60"},
            {"B", "Sedan", "538", "65"},
            {"C", "SUV", "662", "57"},
            {"D", "SUV", "471", "62"},
            {"E", "MPV", "541", "64"},
            {"F", "MPV", "433", "53"}
        };
        
        for(int i = 0; i <= dataMobil.length - 1; i++ ) {
            if(dataMobil[i][1] == "Sedan") {
                s.jarak = Double.parseDouble(dataMobil[i][2]);
                s.kecepatan = Double.parseDouble(dataMobil[i][3]);                
                System.out.println("\nMobil " + dataMobil[i][0]);               
                s.PerhitunganBBM();
                s.hitungLamaPerjalanan();
                s.tampilHasil();
                
            } 
            
            else if(dataMobil[i][1] == "SUV") {
                suv.jarak = Double.parseDouble(dataMobil[i][2]);
                suv.kecepatan = Double.parseDouble(dataMobil[i][3]);                
                System.out.println("\nMobil " + dataMobil[i][0]);              
                suv.PerhitunganBBM();
                suv.hitungLamaPerjalanan();
                suv.tampilHasil();   
            } 
            
            else if(dataMobil[i][1] == "MPV") {
                mpv.jarak = Double.parseDouble(dataMobil[i][2]);
                mpv.kecepatan = Double.parseDouble(dataMobil[i][3]);
                System.out.println("\nMobil " + dataMobil[i][0]);         
                mpv.PerhitunganBBM();
                mpv.hitungLamaPerjalanan();
                mpv.tampilHasil();
                
            }
        }
    } 
}
