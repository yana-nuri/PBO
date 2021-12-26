/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttugasuas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class SubMenuHapusData extends menuUtama {
    int menuChoice = choice;
    Scanner input = new Scanner(System.in);
    void subMenu() {
        System.out.println("\n1. Kembali ke Menu Utama");
        System.out.println("2. Hapus Data Kembali");
    }
    
    public void chooseSubMenu() {
        System.out.print("Menu Pilihan : ");
        menuChoice = Integer.parseInt(input.nextLine());
    }
    public void hapusData(ArrayList<ArrayList<String>> dataKaryawan) {
        System.out.print("Kode Karyawan yang mau dihapus : ");
        String kodeKaryawan = input.nextLine();
        boolean found = false;
        int index = 0;
        for(int i = 0; i < dataKaryawan.size(); i++) {
            String dataKodeKaryawan = dataKaryawan.get(i).get(0);
            if(dataKodeKaryawan.equals(kodeKaryawan)){
                found = true;
                index = i;
            }
        }  
        if(found == true) {
            dataKaryawan.remove(index);
            System.out.println("Data Karyawan " + kodeKaryawan + " berhasil dihapus");
        } else {
            System.out.println("Data Karyawan tidak ditemukan");
        }    
    }
}
