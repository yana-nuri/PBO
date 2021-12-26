/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttugasuas;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class ProjectTugasUAS {
public static void main(String[] args) throws ParseException {
        
        // atribut
        ArrayList<ArrayList<String> > dataKaryawan = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        // object
        subMenuTambahData td = new subMenuTambahData();
        SubMenuLiatData ld = new SubMenuLiatData();
        SubMenuHapusData hd = new SubMenuHapusData();
        SubMenuCariData cd = new SubMenuCariData();
        
        while(true) {
            System.out.println("\n===============================================");
            System.out.println("    MENU UTAMA PROGRAM PENDATAAN KARYAWAN");
            System.out.println("===============================================");
            td.menuUtama();
            
            System.out.print("\nMenu pilihan : ");
            int menuChoosen = Integer.parseInt(input.next());

            switch(menuChoosen) {
                
                case 1:
                OUTER:
                while (true) {
                    td.tambahData(dataKaryawan);
                    td.subMenu();

                    td.chooseSubMenu();
                    switch (td.menuChoice) {
                        case 1:
                            break OUTER;
                        case 2:
                            continue;
                        default:
                            System.out.println("Pilihan Invalid, Menuju Ke Menu Utama");
                            break OUTER;
                    }
                }
                   break;
               
                case 2:
                OUTER:
                while (true) {
                    hd.hapusData(dataKaryawan);
                    hd.subMenu();

                    hd.chooseSubMenu();
                    switch (hd.menuChoice) {
                        case 1:
                            break OUTER;
                        case 2:
                            continue;
                        default:
                            System.out.println("Pilihan Invalid, Menuju Ke Menu Utama");
                            break OUTER;
                    }
                }
                    break;
                    
                case 3:
                OUTER:
                while (true) {
                    boolean data = cd.cariData(dataKaryawan);
                    if(data == false) {
                        System.out.println("Data Karyawan Tidak Ditemukan");
                        
                        cd.subMenu();
                        cd.chooseSubMenu();
                    } else {
                        cd.showData(dataKaryawan, cd.index);

                        cd.subMenu();
                        cd.chooseSubMenu();
                    }
                    switch (cd.menuChoice) {
                        case 1:
                            break OUTER;
                        default:
                            System.out.println("Pilihan Invalid, Menuju Ke Menu Utama");
                            break OUTER;
                    }
                }
                    break;

                case 4:
                OUTER:
                while (true) {
                    ld.lihatData(dataKaryawan);
                    ld.subMenu();
                    ld.chooseSubMenu();
                    switch (ld.menuChoice) {
                        case 1:
                            break OUTER;
                        default:
                            System.out.println("Pilihan Invalid, Menuju Ke Menu Utama");
                            break OUTER;
                    }
                }
                    break;

                case 5:
                    System.out.println("\nProgram telah berhenti");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilih menu yang tersedia :");
                    break;
            }
        }
    }
}
