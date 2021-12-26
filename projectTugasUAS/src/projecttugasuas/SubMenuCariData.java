/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttugasuas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class SubMenuCariData extends menuUtama {
    int menuChoice = choice;
    Scanner input = new Scanner(System.in);
    boolean found = false;
    int index = 0;
    int A,B,C,D,E,F,G;
    double X,Y;
    String V,M;
    
    void subMenu() {
        System.out.println("\n1. Kembali ke Menu Utama");
    }

    public void chooseSubMenu() {
        System.out.print("Menu Pilihan : ");
        menuChoice = Integer.parseInt(input.nextLine());
    }
    public boolean cariData(ArrayList<ArrayList<String>> dataKaryawan) throws ParseException {
        System.out.print("Masukkan kode karyawan : ");
        String kodeKaryawan = input.nextLine();
        for(int i = 0; i < dataKaryawan.size(); i++) {
            String dataKodeKaryawan = dataKaryawan.get(i).get(0);
            
            if(dataKodeKaryawan.equals(kodeKaryawan)){
                found = true;
                index = i;
            } else {
                found = false;
            }
        }
        return found;
    }
    
    public void gaji() {
        switch(V) {
            case "A" :
                C = 5000000;
                break;
                
            case "B" :
                C = 6000000;
                break;
            
            case "C" :
                C = 7000000;
                break;
        }
        if(M == "Sudah Menikah") {
            D = (C * 10) / 100;
        } else {
            D = 0;
        }
        if(A > 30) {
            E = (C * 15) / 100;
        } else {
            E = 0;
        }
        if(B > 0) {
            F = (C * 5 / 100) * B;
        } else {
            F = 0;
        }
        G = C + D + E + F;
        X = (G * 2.5) / 100;
        Y = G - X;
    }
    
    public void showData(ArrayList<ArrayList<String>> dataKaryawan, int index) throws ParseException {
        String kodeKaryawan = dataKaryawan.get(index).get(0);
        String namaKaryawan = dataKaryawan.get(index).get(1);
        V = dataKaryawan.get(index).get(4);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(dataKaryawan.get(index).get(3));
        LocalDate birthDay = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period period = Period.between(birthDay, LocalDate.now());
        A = period.getYears();
        M = dataKaryawan.get(index).get(5);
        if(M == "Sudah Menikah") {
            B = Integer.parseInt(dataKaryawan.get(index).get(6));
        } else {
            B = 0;
        }
        
        gaji();
        System.out.println("\n================================");
        System.out.println("    DATA PROFILE KARYAWAN");
        System.out.println("--------------------------------");
        System.out.println("Kode Karyawan : " + kodeKaryawan);
        System.out.println("Nama Karyawan : " + namaKaryawan);
        System.out.println("Golongan : " + V);
        System.out.println("Usia : " + A);
        System.out.println("Status Menikah : " + M);
        System.out.println("Jumlah Anak : " + B);
        System.out.println("-------------------------------");
        System.out.println("Gaji Pokok : Rp. " + C);
        System.out.println("Tunjangan Istri/Suami : Rp. " + D);
        System.out.println("Tunjangan Pegawai : Rp. " + E);
        System.out.println("Tunjangan Anak : Rp. " + F);
        System.out.println("-------------------------------");
        System.out.println("Gaji Kotor : Rp. " + G);
        System.out.println("Potongan : Rp. " + X);
        System.out.println("-------------------------------");
        System.out.println("Gaji Bersih : Rp. " + Y);
    }
}