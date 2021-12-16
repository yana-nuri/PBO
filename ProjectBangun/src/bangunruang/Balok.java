/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Acer
 */
public class Balok extends BangunRuang {
    public double panjang, lebar, tinggi;
    public double hitungVolume() {      
        double vol = panjang * lebar * tinggi;
        return vol;
    }

    public double hitungLuasPermukaan() {      
        double luasp = 2 * ((panjang * lebar) + (lebar * tinggi) + (tinggi + panjang));
        return luasp;
    }
}
