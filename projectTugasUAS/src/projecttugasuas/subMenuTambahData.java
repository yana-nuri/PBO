/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttugasuas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class subMenuTambahData extends menuUtama {
    String KK,NK,ALT,TGL,GLN,JA, status;
    int menuChoice = choice;
    Scanner input = new Scanner(System.in);
    ArrayList<ArrayList<String>> dataKaryawan = new ArrayList<>();

    

    void subMenu() {
        System.out.println("\n1. Kembali ke menu utama");
        System.out.println("2. Tambah data kembali");
    }
    
    public void chooseSubMenu() {
        System.out.print("Menu Pilihan : ");
        menuChoice = Integer.parseInt(input.nextLine());
    }
    public void tambahData(ArrayList<ArrayList<String>> dataKaryawan) {
        System.out.print("\nMasukkan Kode Karyawan : ");
        KK = input.nextLine();
        System.out.print("Masukkan Nama Karyawan : ");
        NK = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        ALT = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir : ");
        TGL = input.nextLine();
        System.out.print("Masukkan Golongan (A, B, C) : ");
        GLN = input.nextLine();
        
        switch(GLN) {
            case "A" :break;
            case "B" :break;
            case "C" :break;
            default :
                System.out.println("\nStatus Menikah Tidak Valid, Silakan Ulangi dari Awal");
                tambahData(dataKaryawan);
        }
        System.out.print("Masukkan Status Menikah ( 0 jika belum, 1 jika sudah) : ");
        status = input.nextLine();
        if(Integer.parseInt(status) == 0) {
            dataKaryawan.add(new ArrayList<String>(
                Arrays.asList(KK, NK, ALT,TGL,GLN, "Belum Menikah")
            ));
        } 
        else if(Integer.parseInt(status) == 1) {
            System.out.print("Masukkan Jumlah Anak : ");
            JA = input.nextLine();
            dataKaryawan.add(new ArrayList<String>(
                Arrays.asList(KK, NK, ALT,TGL,GLN, "Sudah Menikah", JA)
            ));
        } 
        else {
            System.out.println("\nStatus Menikah Anda Tidak Valid Silakan Ulangi Kembali");
            tambahData(dataKaryawan);
        }
    }
}
