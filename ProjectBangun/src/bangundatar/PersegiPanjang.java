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
public class PersegiPanjang extends BangunDatar {
    public double panjang, lebar;
    public double hitungLuas(){    
        double luas = panjang * lebar;
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling = 2 * (panjang + lebar);
        return keliling;
    }
}
