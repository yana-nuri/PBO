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
public class Tabung extends BangunRuang {
    public double jarijari, tinggi;
    public double hitungVolume() {
        double vol = Math.PI * Math.pow(jarijari, 2) * tinggi;
        return vol;
    }

    public double hitungLuasPermukaan() {
        double luasp = Math.PI * jarijari * (jarijari + (2 * tinggi));
        return luasp;
    }
}
