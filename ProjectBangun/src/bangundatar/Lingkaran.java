/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Acer
 */
public class Lingkaran extends BangunDatar {
    public double jarijari;
    public double hitungLuas(){
        double luas = Math.PI * jarijari * jarijari;
        return luas;
    }

    public double hitungKeliling(){ 	  
        double keliling = 2 * Math.PI * jarijari;
        return keliling;
    }
}
